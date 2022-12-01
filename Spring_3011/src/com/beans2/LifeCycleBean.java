package com.beans2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
	BeanFactory beanFactory=null;
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory=beanFactory;
		System.out.println("bean factory is invoked..");
		
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("SetBeanName() is invoked...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterproperiesSet() is invoked..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean is destoyed");
	}
		
		
	}

	
