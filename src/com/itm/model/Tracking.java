package com.itm.model;

public class Tracking {
	private int id;
	private String mobileno;
	private String tracking_date;
	private String tracking_time;
	private String address;
	private String latitude;
	private String longitude;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getTracking_date() {
		return tracking_date;
	}
	public void setTracking_date(String tracking_date) {
		this.tracking_date = tracking_date;
	}
	public String getTracking_time() {
		return tracking_time;
	}
	public void setTracking_time(String tracking_time) {
		this.tracking_time = tracking_time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
