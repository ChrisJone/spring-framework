package com.runcode.springstudy.instantiation;

public class ClientService {
	public ClientService(){}

	public static ClientService createInstance(){
		System.out.println("createInstance.............");
		return new ClientService();
	}

	public void sayHello(){
		System.out.println("hello spring");
	}
}
