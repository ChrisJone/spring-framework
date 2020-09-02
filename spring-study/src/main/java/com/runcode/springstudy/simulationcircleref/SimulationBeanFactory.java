package com.runcode.springstudy.simulationcircleref;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
//https://mp.weixin.qq.com/s/5mwkgJB7GyLdKDgzijyvXw
public class SimulationBeanFactory {

	//模拟缓存
	private static Map<String,Object> cacheMap = new HashMap<String,Object>();

	public static <T> T getBean(Class<T> beanClass){
		String beanName = beanClass.getSimpleName().toLowerCase();

		if (cacheMap.containsKey(beanName)){
			return (T) cacheMap.get(beanName);
		}

		try {
			//实例化对象
			Object object = beanClass.getDeclaredConstructor().newInstance();
			//缓存对象，内存地址，后续即使注入属性或者变更(比如aop等）都可以同步更改注入属性
			cacheMap.put(beanName,object);

			//getFields和getDeclaredFields的差别：私有是否能取出
			Field[] fields = object.getClass().getDeclaredFields();
			for (Field field: fields){
				field.setAccessible(true);
				Class<?> filedClass = field.getType();
				String filedBeanName = filedClass.getSimpleName().toLowerCase();
				field.set(object,cacheMap.containsKey(filedBeanName)?cacheMap.get(filedBeanName):getBean(filedClass));
			}
			return (T) object;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
