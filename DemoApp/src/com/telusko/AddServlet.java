package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//
//		System.out.println("Console output using service is: " + k);
//		
//		//PrintWriter out = res.getWriter();
//		//out.println("Result on client/browser is: " + k);
//		res.getWriter().println("Result on client/browser using service is: " + k);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		System.out.println("Console output using doGet method is: " + k);
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("Result on client/browser is: " + k);
		out.println("</body></html>");
		//res.getWriter().println("Result on client/browser using doGet is: " + k);
	}
	
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//
//		System.out.println("Console output using doPost is: " + k);
//		
//		//PrintWriter out = res.getWriter();
//		//out.println("Result on client/browser is: " + k);
//		res.getWriter().println("Result on client/browser using doPost is: " + k);
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		//Request Dispatcher- SqServlet will compute square of k and send back to client	
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		req.setAttribute("k", k);	
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);	
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		//Send Redirect Example
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		res.sendRedirect("sq?k="+k); //Also called URL Rewriting
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//	
//		//Session management
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;	
//	
//		HttpSession session = req.getSession(); 
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");		
//	}	
	
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		//Cookies
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//
//		Cookie cookie = new Cookie("k",k+"");
//		res.addCookie(cookie);
//		res.sendRedirect("sq");		
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		//ServletContext
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		res.getWriter().print("Hi "+ str);
//	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		//ServletConfig
//		ServletConfig cg = getServletConfig();
//		String str = cg.getInitParameter("name");
//		res.getWriter().print("Hi "+ str);
//	}	
}
