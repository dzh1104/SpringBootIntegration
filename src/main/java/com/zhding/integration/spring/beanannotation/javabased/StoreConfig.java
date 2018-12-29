package com.zhding.integration.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@ImportResource("classpath:config.xml")
@Component
public class StoreConfig {

////	@Value("${url}")
private String url;
//
////	@Value("${jdbc.username}")
private String username;
//
////	@Value("${password}")
private String password;

public void setUrl(String url) {

	this.url = url;
}

public void setUsername(String username) {

	this.username = username;
}

public void setPassword(String password) {

	this.password = password;
}

@Bean
public MyDriverManager myDriverManager() {

	System.out.println("注册Bean: myDriverManager");
	return new MyDriverManager(url, username, password);
}


//	@Bean(name = "stringStore", initMethod="init", destroyMethod="destroy")
//	public Store stringStore() {
//		return new StringStore();
//	}


//@Bean(name = "stringStore")
//// @Bean // 如果不加name，取方法名作为标识
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//public Store getStringStore() {
//
//	return new StringStore();
//}

@Autowired
private Store<String> s1;

@Autowired
private Store<Integer> s2;

@Bean
public StringStore stringStore() {

	System.out.println("注册Bean: stringStore");
	return new StringStore();
}

@Bean
public IntegerStore integerStore() {

	System.out.println("注册Bean: integerStore");
	return new IntegerStore();
}

@Bean(name = "stringStoreTest")
//用 Store 也会报错，用 StringStore 也报错
//@Bean是按着类型来注入对象的，多个同类型的Bean，就会导致错误： expected single matching bean but found 2: stringStore,stringStoreTest
//public Store stringStoreTest() {
public DoubleStore stringStoreTest() {

	System.out.println("s1 : " + s1.getClass().getName());
	System.out.println("s2 : " + s2.getClass().getName());
	return new DoubleStore();
}

}
