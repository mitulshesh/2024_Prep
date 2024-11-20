package org.conduktor.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;


public class ProducerDemoKeys {

    private static final Logger log= LoggerFactory.getLogger(ProducerDemoKeys.class.getSimpleName());

    public static void main(String[] args) throws InterruptedException {
        log.info("I am a producer!!");

        String topic = "third_topic";

        //Create producer properties
        Properties prop =new Properties();
        //localhost
        prop.setProperty("bootstrap.servers", "localhost:9092");
        prop.setProperty("key.serializer", StringSerializer.class.getName());
        prop.setProperty("value.serializer",StringSerializer.class.getName());

        //prop.setProperty("partitioner.class", RoundRobinPartitioner.class.getName());

        //Create a producer
        KafkaProducer<String,String> producer =new KafkaProducer<>(prop);

        for(int j=0;j<2;j++) {
            for (int i = 0; i <= 10; i++) {

                String key = "id"+i;
                String value = "parnali"+i;

                //Create producer record
                ProducerRecord<String, String> record = new ProducerRecord<>(topic,key,value);

                // Send data
                producer.send(record, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                        log.info("key: "+key+"|"+" Partition: " + recordMetadata.partition());
                    }
                });
            }
        }

        //flush and close the producer
        producer.flush();
        producer.close();
    }
}
