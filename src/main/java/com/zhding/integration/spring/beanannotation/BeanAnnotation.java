package com.zhding.integration.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("bean")
//@Scope("prototype")
@Scope
@Component
public class BeanAnnotation {

public void say(String arg) {
	
	System.out.println("BeanAnnotation : " + arg);
}

public void myHashCode() {

	System.out.println("BeanAnnotation : " + this.hashCode());
}

}
