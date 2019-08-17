package com.goffity.demo.message.queue.rabbitmq.email.message;

import com.google.gson.Gson;

import com.goffity.demo.message.queue.rabbitmq.email.customer.Customer;
import com.goffity.demo.message.queue.rabbitmq.email.email.EmailService;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

@RabbitListener(queues = "#{autoDeletedQueue.name}")
public class MessageReceiver {
    @Autowired
    EmailService emailService;

    @RabbitHandler
    public void receive(String s) {
        System.out.println(s);
        Customer customer = new Gson().fromJson(s, Customer.class);
        emailService.sendMessageToCustomer(customer);
    }
}
