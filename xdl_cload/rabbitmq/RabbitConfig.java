package com.example.demo.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

/**
 * 配置rabbitmq相关的信息
 * @author a
 *
 */

@Configuration
public class RabbitConfig {
	/**
	 * 创建一个队列
	 */
  @Bean
  public Queue hello(){
  	return new Queue("hello");
  }
}
