package org.conduktor.kafka.wikimedia;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WikimediaChangeHandler implements EventHandler {

    private KafkaProducer<String,String> producer;
    private String topic;
    private static final Logger log = LoggerFactory.getLogger(WikimediaChangeHandler.class.getSimpleName());

    public WikimediaChangeHandler(KafkaProducer<String,String> producer,String topic){
        this.producer = producer;
        this.topic  = topic;
    }
    @Override
    public void onOpen() {
        //do nothing
    }

    @Override
    public void onClosed() {
        producer.close();
    }

    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {

        log.info("Message received from stream: "+messageEvent.getData());
        producer.send(new ProducerRecord<String,String>(messageEvent.getData(),topic));
    }

    @Override
    public void onComment(String s) throws Exception {
        //do nothing
    }

    @Override
    public void onError(Throwable throwable) {
        log.error(throwable.getMessage());
    }
}
