package com.runcode.springstudy.instantiation;

import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class ClientService {
	public ClientService(){

	}

	public static ClientService createInstance(){
		System.out.println("createInstance.............");
		return new ClientService();
	}


	public void sayHello(){
		System.out.println("hello spring");
	}
}
