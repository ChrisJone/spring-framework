package com.runcode.springstudy.factorybean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactoryBean implements FactoryBean<Object>, InitializingBean, DisposableBean {

	private String interfaceName;
	private Object target;
	private Object proxyObj;

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy begin......\n");
	}

	@Override
	public Object getObject() throws Exception {
		System.out.println("getObject......\n");
		return proxyObj;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjectType.........\n");
		return proxyObj == null ? Object.class:proxyObj.getClass();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		proxyObj = Proxy.newProxyInstance(this.getClass().getClassLoader(),
				new Class[]{Class.forName(interfaceName)},
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("invoke method .........."+method.getName()+"\n");
						System.out.println("invoke method before ........."+ System.currentTimeMillis()+"\n");
						Object result = method.invoke(target,args);
						System.out.println("invoke method after .........."+ System.currentTimeMillis()+"\n");
						return result;
					}
				});
		System.out.println("afterPropertiesSet...........");
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object getProxyObj() {
		return proxyObj;
	}

	public void setProxyObj(Object proxyObj) {
		this.proxyObj = proxyObj;
	}
}


