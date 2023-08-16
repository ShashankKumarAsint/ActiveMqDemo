package com.activemq.ActiveMq_demo.Configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;



@Configuration
@EnableJms
public class ActiveMqConfig {

	@Bean
	public ActiveMQConnectionFactory customConnectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		
		connectionFactory.setBrokerURL("vm://embedded");
		connectionFactory.setUserName("admin");
		connectionFactory.setPassword("admin1234");
		
		return connectionFactory;
	}

}
