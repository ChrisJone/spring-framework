package com.runcode.springstudy.test;

import com.runcode.springstudy.AppConfig;
import com.runcode.springstudy.components.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//设置非循环依赖，也可以在源码中修改
		//context.setAllowCircularReferences(false);
		context.register(AppConfig.class);
		context.refresh();
		System.out.println(context.getBean(AppConfig.class));
	}
}
