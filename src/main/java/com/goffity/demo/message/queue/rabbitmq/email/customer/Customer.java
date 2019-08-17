package com.goffity.demo.message.queue.rabbitmq.email.customer;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
}
