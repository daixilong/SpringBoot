package com.example.demo.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		String context="hello"+new Date();
		System.out.println("======================"+context);
		//将消息发送到hello队列中
		amqpTemplate.convertAndSend("hello",context);
	}
}
