package com.runcode.springstudy.test;

import com.runcode.springstudy.service.MessageService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class XmlFileConfigTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring/application.xml");
		MessageService messageService = (MessageService) ctx.getBean("messageService");
		//MessageService messageService = (MessageService) ctx.getBean(MessageService.class);
		messageService.sendMsg("hello");
	}
}
