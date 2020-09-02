package com.runcode.springstudy.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class X{
	@Autowired
	Y y;

	public X(){
		System.out.println("X created");
	}
}
