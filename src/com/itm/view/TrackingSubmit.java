package com.itm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.controller.TrackingController;
import com.itm.model.Tracking;

/**
 * Servlet implementation class TrackingSubmit
 */
@WebServlet("/TrackingSubmit")
public class TrackingSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrackingSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Tracking T=new Tracking();
		T.setMobileno(request.getParameter("mobileno"));
		T.setLatitude(request.getParameter("latitude"));
		T.setLongitude(request.getParameter("longitude"));
		T.setTracking_time(request.getParameter("ct"));
		T.setTracking_date(request.getParameter("cd"));
		T.setAddress(request.getParameter("address"));
		
		boolean st=TrackingController.addNewRecord(T);
		if(st){
			out.println(1);
			}else{
				out.println(0);
			}
		}
	}

