package com.zhding.integration.Spring.beanannotation;

import com.zhding.integration.spring.beanannotation.javabased.Store;
import com.zhding.integration.spring.beanannotation.javabased.StoreConfig;
import com.zhding.integration.util.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {
	
	public TestJavabased() {
//		super("classpath*:spring-beanannotation.xml");

//		配合使用 xml配置 获取外部资源
		super("classpath*:config.xml");
	}
	
	@Test
	public void test() {
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void testMyDriverManager() {
//		MyDriverManager manager = super.getBean("myDriverManager");
//		System.out.println(manager.getClass().getName());

//	    配合使用 config.xml 使用xml文件去使用配置
		StoreConfig manager = super.getBean("storeConfig");
//		System.out.println(manager.myDriverManager().getClass().getName());
	}
	
	@Test
	public void testScope() {
		Store store = super.getBean("stringStore");
		System.out.println(store.hashCode());

		store = super.getBean("stringStore");
		System.out.println(store.hashCode());
	}
	
	@Test
	public void testG() {
//		StoreConfig storeConfig = super.getBean("storeConfig");
//		System.out.println("storeConfig" + storeConfig.stringStoreTest());

//		Store store = super.getBean("stringStoreTest");
	}
	
}
