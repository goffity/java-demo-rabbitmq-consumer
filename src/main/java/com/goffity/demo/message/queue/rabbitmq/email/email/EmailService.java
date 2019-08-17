package com.goffity.demo.message.queue.rabbitmq.email.email;

import com.goffity.demo.message.queue.rabbitmq.email.customer.Customer;

public interface EmailService {
    void sendMessageToCustomer(Customer customer);
}
