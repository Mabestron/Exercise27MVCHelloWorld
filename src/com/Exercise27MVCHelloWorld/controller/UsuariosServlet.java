package com.Exercise27MVCHelloWorld.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Hello World");
		String sid="";
		String sname="";
		String sage="";
		
		sid= request.getParameter("txtID");
		sname= request.getParameter("txtNombre");
		sage=request.getParameter("txtAge");
		
		response.getWriter().append("The Id input is:"+sid);
		response.getWriter().append("The Name input is: "+ sname);
		response.getWriter().append("The Age input is: "+ sage);
		
	}

}
