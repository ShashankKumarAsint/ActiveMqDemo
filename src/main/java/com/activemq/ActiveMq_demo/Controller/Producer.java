package com.activemq.ActiveMq_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activemq.ActiveMq_demo.Service.MessageService;

@RestController
public class Producer {

	
	private MessageService messageService;
	
	public Producer(MessageService messageService) {
		
		this.messageService=messageService;
	}
	
	@GetMapping("/produce")
	public String sendMessage(@RequestParam("message")String  message) {
		messageService.sendMessage(message);
		return "message sent successfull";
	}
	
	
}
