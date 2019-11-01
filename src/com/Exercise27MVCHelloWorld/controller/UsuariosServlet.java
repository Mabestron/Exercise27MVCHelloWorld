package com.Exercise27MVCHelloWorld.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exercise27MVCHelloWorld.model.UserModel;
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
		int iid=0;
		String sname="";
		String sage="";
		int shage=0;
		
		//etiqueta name del html																		
		sid= request.getParameter("txtID");
		iid = Integer.parseInt(sid);
		sname= request.getParameter("txtNombre");
		sage=request.getParameter("txtAge");
		shage= Integer.parseInt(sage);
		
		 UserModel myUser1= new UserModel(iid,sname,shage);
		 UserModel myUser2=new UserModel();
		 
		 myUser2.setId(iid);
		 myUser2.setNombre(sname);
		 myUser2.setEdad(shage);
		 
		 response.getWriter().append("The id input myUser1 is: "+myUser1.getId());
		 response.getWriter().append("The name input myUser1 is: "+myUser1.getNombre());
		 response.getWriter().append("The age input myUser1 is: "+myUser1.getEdad());
		
		
		
		response.getWriter().append("The Id input myUser2 is:"+myUser2.getId());
		response.getWriter().append(" The Name input myUser2 is: "+ myUser2.getNombre());
		response.getWriter().append(" The Age input myUser2 is: "+ myUser2.getEdad());
		
		
	}

}
