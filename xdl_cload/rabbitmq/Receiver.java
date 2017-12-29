package com.example.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * 消息的监听
 * @author a
 *
 */
@Component
@RabbitListener(queues="hello")
public class Receiver {
	@RabbitHandler
	public void process(String msg){
		System.out.println("收到的消息为:"+msg);
	}
}
