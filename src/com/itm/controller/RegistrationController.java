package com.itm.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.itm.model.Registration;

public class RegistrationController {

public static boolean addNewRecord(Registration R){ 
	try{
	Connection cn=DBHelper.openConnection();
	String q="insert into registration values('"+R.getEmailid()+"','"+R.getFirstname()+"','"+R.getLastname()+"','"+R.getMobileno()+"','"+R.getPicture()+"','"+R.getPassword()+"')";
	boolean st=DBHelper.executeUpdate(cn, q);
	return(st);
}catch(Exception e){
	System.out.println(e);
	return(false);
  }	
}

public static ResultSet checkLogin(String user,String password){ 
	try{
	Connection cn=DBHelper.openConnection();
	String q="select * from registration  where (emailid='"+user+"' or mobileno='"+user+"') and password='"+password+"'";
	//System.out.println(q);
	ResultSet rs=DBHelper.executeQuery(cn, q);
	 return(rs);
}catch(Exception e){
	System.out.println(e);
	return(null);
  }
 }

public static boolean updateProfile(String edit,String mob,String field){
	try{
		String q;
		boolean rs = false;
		Connection cn=DBHelper.openConnection();
		if(edit.equals("fname")){
			q="update registration set firstname='"+field+"' where mobileno='"+mob+"'";
			rs=DBHelper.executeUpdate(cn, q);
		}
		
		else if(edit.equals("lname")){
			q="update registration set lastname='"+field+"' where mobileno='"+mob+"'";
			rs=DBHelper.executeUpdate(cn, q);
		}
		
		else if(edit.equals("email")){
			q="update registration set emailid='"+field+"' where mobileno='"+mob+"'";
			rs=DBHelper.executeUpdate(cn, q);
		}
		return rs;
	}catch(Exception e){
		return false;
	}
  }

   public static boolean deleteAccount(String mobileno){
	   try{
		   Connection cn=DBHelper.openConnection();
		   boolean rs=false;
		   String q="delete from registration where mobileno='"+mobileno+"'";
		   rs=DBHelper.executeUpdate(cn, q);
		   return rs;
	   }catch(Exception e){
		   return false;
	   }
   }
}

