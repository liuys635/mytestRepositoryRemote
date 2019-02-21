package com.lys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * spring-boot 整合servlet方式一
 * @author liuysh
 *
 */
@SpringBootApplication
@ServletComponentScan //在spring-boot启动时会扫描@WebServlet注解，并将该类实例化
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);

		
	
	}

}
