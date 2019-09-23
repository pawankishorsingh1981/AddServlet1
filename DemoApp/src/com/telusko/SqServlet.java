package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		//Used in Request Dispatcher
//		int k = (int) req.getAttribute("k");
//		k = k * k;
//		res.getWriter().println("Result of squaring on client/browser after Request Dispatcher is: " + k);
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		//Used in Redirect Example
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k * k;
//		res.getWriter().println("Result of squaring on client/browser after Redirect is: " + k);
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		
//		//Used in Session Management
//		HttpSession session = req.getSession(); 
//		//session.removeAttribute("k"); //Just a demo that it can be removed too
//		int k = (int) session.getAttribute("k");
//		k = k * k;
//		res.getWriter().println("Result of squaring on client/browser after Session Management is: " + k);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		//Used in Cookies
		int k = 0;
		javax.servlet.http.Cookie[] cookies = req.getCookies();
		
		for (javax.servlet.http.Cookie c: cookies) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		k = k*k;
		res.getWriter().println("Result of squaring on client/browser after Cookies is: " + k);
	}
}
