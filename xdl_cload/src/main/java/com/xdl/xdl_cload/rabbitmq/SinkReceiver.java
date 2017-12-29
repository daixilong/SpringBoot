package com.xdl.xdl_cload.rabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class SinkReceiver {
	@StreamListener(value=Sink.INPUT)
	public void receive(String msg){
		System.out.println("================"+msg);
	}
}
