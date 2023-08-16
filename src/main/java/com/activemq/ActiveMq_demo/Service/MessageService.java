package com.activemq.ActiveMq_demo.Service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	
	private JmsTemplate jmsTemplate;
	
	public MessageService(JmsTemplate template) {
		this.jmsTemplate = template;
	}
	
	public void sendMessage(String message) {
		jmsTemplate.convertAndSend("Address_1", message);
	}
	
}
