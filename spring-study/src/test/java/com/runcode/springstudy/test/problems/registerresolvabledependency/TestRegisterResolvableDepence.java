package com.runcode.springstudy.test.problems.registerresolvabledependency;

import com.runcode.springstudy.AppConfig;
import com.runcode.springstudy.problems.registerresolvabledependency.Component;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRegisterResolvableDepence {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Component.class);
	}
}
