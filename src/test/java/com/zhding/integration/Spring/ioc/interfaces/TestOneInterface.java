package com.zhding.integration.Spring.ioc.interfaces;

import com.zhding.integration.spring.ioc.interfaces.OneInterface;
import com.zhding.integration.util.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testSay() {
		// 从容器中取得对象
		OneInterface oneInterface = super.getBean("oneInterface");
		oneInterface.say("This is a test.");
	}

}
