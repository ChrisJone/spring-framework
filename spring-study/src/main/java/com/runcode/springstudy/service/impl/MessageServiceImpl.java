package com.runcode.springstudy.service.impl;

import com.runcode.springstudy.service.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
//@Qualifier("message")
public class MessageServiceImpl  implements MessageService {
	@Override
	public void sendMsg(String msg) {
		System.out.println("send msg ->" + msg);
	}
}
