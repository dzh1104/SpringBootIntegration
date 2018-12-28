package com.zhding.integration.spring.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

//	@Value("${url}")
private String url;

//	@Value("${jdbc.username}")
private String username;

//	@Value("${password}")
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

	return new MyDriverManager(url, username, password);
}


//	@Bean(name = "stringStore", initMethod="init", destroyMethod="destroy")
//	public Store stringStore() {
//		return new StringStore();
//	}


//@Bean(name = "stringStore")
//@Bean // 如果不加name
//	@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//public Store getStringStore() {
//
//	return new StringStore();
//}

//	@Autowired
//	private Store<String> s1;
//
//	@Autowired
//	private Store<Integer> s2;
//
//	@Bean
//	public StringStore stringStore() {
//		return new StringStore();
//	}
//
//	@Bean
//	public IntegerStore integerStore() {
//		return new IntegerStore();
//	}

//	@Bean(name = "stringStoreTest")
//	public Store stringStoreTest() {
//		System.out.println("s1 : " + s1.getClass().getName());
//		System.out.println("s2 : " + s2.getClass().getName());
//		return new StringStore();
//	}

}
