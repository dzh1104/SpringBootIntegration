package com.zhding.integration.Spring.bean;

import com.zhding.integration.spring.bean.BeanScope;
import com.zhding.integration.util.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
	
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
	
	@Test
	public void testSay2() {
		BeanScope beanScope  = super.getBean("beanScope");
		beanScope.say();
	}

}
