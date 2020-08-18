package com.runcode.springstudy.test;

import com.runcode.springstudy.factorybean.MyFactoryBean;
import com.runcode.springstudy.service.MessageService;
import com.runcode.springstudy.service.impl.MessageServiceImpl;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class XmlFileConfigTest {

	public static void main(String[] args) throws Exception {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring/application.xml");
		MessageService messageService = (MessageService) ctx.getBean("messageService");
		//MessageService messageService = (MessageService) ctx.getBean(MessageService.class);
		messageService.sendMsg("hello");

		MyFactoryBean messageService1  = (MyFactoryBean) ctx.getBean("fbMessageService");
		messageService1.getObject();
	}
}
