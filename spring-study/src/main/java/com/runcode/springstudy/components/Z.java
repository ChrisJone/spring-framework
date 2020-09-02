package com.runcode.springstudy.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Z /*implements ApplicationContextAware*/ {
	/*@Autowired
	X x;

	public Z(){
		System.out.println("Z created");
	}

	@PostConstruct
	public void zinit(){
		System.out.println("call z lifecycle init callback");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call aware callback");
	}*/
}
