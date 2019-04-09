package com.itm.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.itm.model.Tracking;

public class TrackingController {
	public static boolean addNewRecord(Tracking T)
	{ 
		try{
		Connection cn=DBHelper.openConnection();
		String q="insert into tracking(mobileno,latitude,longitude,trackingtime,trackingdate,address) values('"+T.getMobileno()+"','"+T.getLatitude()+"','"+T.getLongitude()+"','"+T.getTracking_time()+"','"+T.getTracking_date()+"','"+T.getAddress()+"')";
		boolean st=DBHelper.executeUpdate(cn, q);
		return(st);
	}catch(Exception e){
		System.out.println(e);
		return(false);
	}
  }
	public static ResultSet searchByMobileNo(String mobileno)
	{
          try{
		Connection cn=DBHelper.openConnection();
		String q="select * from tracking where mobileno='"+mobileno+"' order by id desc limit 1,10";
		System.out.println(q);
		ResultSet rs=DBHelper.executeQuery(cn, q);
		return(rs);
	}catch(Exception e){
		System.out.println(e);
		return(null);
      }
	}
	
	public static ResultSet searchByTimeDate(String date,String from,String to,String mobileno){
		try{
			Connection cn=DBHelper.openConnection();
			String q="select * from tracking where mobileno='"+mobileno+"' and trackingdate='"+date+"' and trackingtime between '"+from+"' and '"+to+"'";
			ResultSet rs=DBHelper.executeQuery(cn, q);
			return rs;
		}catch(Exception e){
			System.out.print(e);
			return null;
		}
	}
}
