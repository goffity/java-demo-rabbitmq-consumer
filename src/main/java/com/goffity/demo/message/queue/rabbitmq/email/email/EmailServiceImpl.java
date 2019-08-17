package com.goffity.demo.message.queue.rabbitmq.email.email;

import com.goffity.demo.message.queue.rabbitmq.email.customer.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendMessageToCustomer(Customer customer) {
        System.out.println(customer.toString());
        System.out.println("OK");

        // Send email.
//        StringBuilder subject = new StringBuilder("Created User ");
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        subject.append(customer.getFirstName()).append(" ");
//        subject.append(customer.getLastName());
//        System.out.println(subject.toString());
//
//        message.setTo(customer.getEmail());
//        message.setSubject(subject.toString());
//        message.setText(customer.toString());
//        emailSender.send(message);
    }
}