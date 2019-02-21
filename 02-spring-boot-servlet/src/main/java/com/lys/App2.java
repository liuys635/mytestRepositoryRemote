package com.lys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.lys.servlet.SecondServlet;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean bean=new ServletRegistrationBean(new SecondServlet());
		bean.addUrlMappings("/second");
		System.out.println("正在生成SecondServlet实例");
		return bean;
	}
		
}
