package com.activemq.ActiveMq_demo.Controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {

	@JmsListener(destination = "Address_1")
	public void receiveMessage(String message) {
		
		System.out.println("Message received");
		System.out.println("Message : "+message);
		
	}
	
}
