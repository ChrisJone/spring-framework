package com.runcode.springstudy.registry;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanImport implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(MyTestBean.class);
		beanDefinition.setSynthetic(true);//合成，自定义bean类
		MutablePropertyValues mpv = beanDefinition.getPropertyValues();
		mpv.addPropertyValue("age","25");
		registry.registerBeanDefinition("myTestBean",beanDefinition);
	}
}
