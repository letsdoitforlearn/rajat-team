package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	String unm=req.getParameter("username");
	String pwd=req.getParameter("password");
	String msg="";
	if(unm.equals(pwd)){
		msg="<h1>Login Success<br/>Welcome to JLC Home page";
	}else{
		msg="<h1>Login Failed<br/>Invalid Username or Password";
	}
	Writer out=res.getWriter();
	out.write(msg);
}
}
