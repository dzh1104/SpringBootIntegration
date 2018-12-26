package com.zhding.integration.spring.ioc.injection.service;


import com.zhding.integration.spring.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	//构造器注入 构造器参数名 要和 xml配置文件 中的 name一致
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	//设值注入 setter方法截掉set并小写第一个字符后的名称 要和 xml配置文件 中的 name一致
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}

}
