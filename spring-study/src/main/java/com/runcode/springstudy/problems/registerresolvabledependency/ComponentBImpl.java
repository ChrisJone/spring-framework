package com.runcode.springstudy.problems.registerresolvabledependency;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//@org.springframework.stereotype.Component
public class ComponentBImpl implements Component, InitializingBean, DisposableBean {
	public String mark="b";

	
	//before jdk11,you can add @code @PostContruct annotation on method to init,when spring init method invoke ,
	// the bean with component annotation  will fire
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialization callbacks.......");
	}

	//before jdk11,you can add @PreDestroy annotation on method to init,when spring destroy method invoke ,
	//	// the bean with component annotation  will fire
	@Override
	public void destroy() throws Exception {
		System.out.println("destuction callbacks...");
	}

}
