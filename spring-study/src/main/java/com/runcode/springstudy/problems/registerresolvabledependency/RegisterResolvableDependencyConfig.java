package com.runcode.springstudy.problems.registerresolvabledependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//@org.springframework.stereotype.Component
public class RegisterResolvableDependencyConfig implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//TODO 无法生效，报错：NoUniqueBeanDefinitionException: No qualifying bean of type 'com.runcode.springstudy.problems.registerresolvabledependency.Component' available: expected single matching bean but found 2: componentAImpl,componentBImpl
		//若在ComponentAImpl或者ComponentBImpl使用@Primay指定的话，则可以生效
		beanFactory.registerResolvableDependency(Component.class,new ComponentAImpl());
	}
}
