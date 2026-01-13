package com.injection.InjectionExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjectionExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(InjectionExampleApplication.class, args);
		Dev me = context.getBean(Dev.class);
		me.build();
	}

}
