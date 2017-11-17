package ru.sberbank.javaschool.async.topicexample;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.ConnectionFactory;
import javax.jms.Topic;

@SpringBootApplication
@EnableJms
class TopicExamplesConfig {

    @Bean
    public ConnectionFactory jmsFactory() {
        return new ActiveMQConnectionFactory("tcp://localhost:61616");
    }

    @Bean
    public Topic destination() {
        return new ActiveMQTopic("TESTTOPIC");
    }
}
