package org.conduktor.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


public class ConsumerDemoGracefulShutdown {

    private static final Logger log= LoggerFactory.getLogger(ConsumerDemoGracefulShutdown.class.getSimpleName());

    public static void main(String[] args) throws InterruptedException {
        log.info("I am a consumer!!");
        String groupId = "my-java-application";
        String topic = "third_topic";

        Properties prop =new Properties();
        //connect to localhost
        prop.setProperty("bootstrap.servers", "localhost:9092");

        //Create consumer properties
        prop.setProperty("key.deserializer", StringDeserializer.class.getName());
        prop.setProperty("value.deserializer", StringDeserializer.class.getName());
        prop.setProperty("group.id",groupId);
        //possible values none , earliest (from beginning), latest
        prop.setProperty("auto.offset.reset","earliest");

        //Create a consumer
        KafkaConsumer<String,String> consumer = new KafkaConsumer<>(prop);

        //subscribe to a topic or list of topics
        consumer.subscribe(Arrays.asList(topic));

        //Take reference to main thread
        final Thread mainThread = Thread.currentThread();

        //add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(){
          public void run(){
              log.info("Shutdown is detected.... Lets exit by calling consumer.wakeup() method...");
              consumer.wakeup(); // this is cause consumer.poll to throw an exception which is wakeupException
              //Wait till the mainThread completes it execution
              try {
                  mainThread.join();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        });

        //poll for data
        try {
            while (true) {

                log.info("polling");

                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));

                for (ConsumerRecord<String, String> record : records) {
                    log.info("Key: " + record.key() + " Value: " + record.value());
                    log.info("Partition: " + record.partition() + " Offset: " + record.offset());
                }
            }
        }catch(WakeupException e){
            log.info("Consumer is starting to shutdown");
        }catch (Exception e){
            log.info("Unexpected issue occured in the consumer");
        }finally {
            consumer.close(); // this will also commit the consumer offset
            log.info("The consumer is now gracefully shutdown");
        }
    }
}
