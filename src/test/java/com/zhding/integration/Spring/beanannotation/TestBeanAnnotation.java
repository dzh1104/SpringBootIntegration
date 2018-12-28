package com.zhding.integration.Spring.beanannotation;

import com.zhding.integration.spring.beanannotation.BeanAnnotation;
import com.zhding.integration.util.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("This is test.");
		
		bean = super.getBean("beanAnnotation");
		bean.say("This is test.");
	}
	
	@Test
	public void testScpoe() {
//		下面两个输出的 hashCode 相同，因为在一个测试用例下，是从同一个容器中取对象
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();

		BeanAnnotation bean2 = super.getBean("beanAnnotation");
		bean2.myHashCode();
	}
	
}
