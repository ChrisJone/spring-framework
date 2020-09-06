package com.runcode.springstudy.service.impl;

import com.runcode.springstudy.service.MessageService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author chriswong
 */
@Service
public class MessageServiceImpl  implements MessageService, InitializingBean {
	@Override
	public void sendMsg(String msg) {
		System.out.println("send msg ->" + msg);
	}

	@PostConstruct
	public void init(){
		System.out.println("messageService init ...........");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet..........");
	}
}
