package com.lys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * spring-boot整合servlet方式一
 * @author liuysh
 *
 */
@WebServlet(name="firstServlet",urlPatterns="/first")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("firstServlet....................");
		//this is a git test
		
//        RequestDispatcher rd=req.getRequestDispatcher("/second");  
//        rd.forward(req, resp);  
        
//        resp.getWriter().write("hello world");
//        resp.getWriter().append("Hello World\n");
//        resp.getWriter().append("Hello World\n");
//        resp.getWriter().append("Hello World\n");
//        resp.getWriter().append("Hello World\n");
//        resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        
        RequestDispatcher rd =req.getServletContext().getRequestDispatcher("/second");
        rd.forward(req, resp);
        
        System.out.println("结束");
        
	}
	
}
