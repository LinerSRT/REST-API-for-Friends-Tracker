package com.itm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.controller.RegistrationController;
import com.itm.model.Registration;

/**
 * Servlet implementation class RegistrationSubmit
 */
@WebServlet("/RegistrationSubmit")
public class RegistrationSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Registration R=new Registration();
		R.setEmailid(request.getParameter("emailid"));
		R.setFirstname(request.getParameter("firstname"));
		R.setLastname(request.getParameter("lastname"));
		R.setMobileno(request.getParameter("mobileno"));
		R.setPicture(request.getParameter("picture"));
		R.setPassword(request.getParameter("password"));
		boolean st=RegistrationController.addNewRecord(R);
		if(st)
		{out.println(1);}
		else
		{out.println(0);
 		}}
	}
