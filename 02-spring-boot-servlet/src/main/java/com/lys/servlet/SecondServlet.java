package com.lys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * spring-boot 整合servlet方式二
 * 
 * @author liuysh
 *
 */
public class SecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SecondServlet.................");
		
      resp.getWriter().write("This is SecondServlet!!!!!!!!!!!!");
      
	}
}
