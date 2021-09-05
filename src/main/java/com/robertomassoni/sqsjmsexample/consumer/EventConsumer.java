package com.robertomassoni.sqsjmsexample.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

@Service
public class EventConsumer {

    @JmsListener(destination = "${aws.sqs.queue.name}")
    public void receiveEvent(TextMessage textMessage) throws Exception {
        try {
            // Get message received
            System.out.println(textMessage.getText());
        } catch(Exception e) {
            throw e;
        }
    }
}
