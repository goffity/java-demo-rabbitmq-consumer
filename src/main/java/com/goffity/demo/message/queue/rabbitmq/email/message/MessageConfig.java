package com.goffity.demo.message.queue.rabbitmq.email.message;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
    @Bean
    public TopicExchange topic() {
        return new TopicExchange("customer.topic");
    }

    @Bean
    public Queue autoDeletedQueue() {
        return new AnonymousQueue();
    }

    @Bean
    public Binding binding(TopicExchange topic, Queue autoDeletedQueue) {
        return BindingBuilder.bind(autoDeletedQueue).to(topic).with("email.customer");
    }

    @Bean
    public MessageReceiver receiver() {
        return new MessageReceiver();
    }
}
