package com.service;

public class Weather {

	private String city;
	private String date;
	private String advice;
	private int tem1;
	private int tem2;
	public Weather(String city, String date, String advice, int tem1, int tem2) {
		super();
		this.city = city;
		this.date = date;
		this.advice = advice;
		this.tem1 = tem1;
		this.tem2 = tem2;
	}
	public int getTem1() {
		return tem1;
	}
	public void setTem1(int tem1) {
		this.tem1 = tem1;
	}
	public int getTem2() {
		return tem2;
	}
	public void setTem2(int tem2) {
		this.tem2 = tem2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	@Override
	public String toString() {
		return "Weather [tem1=" + tem1 + ", tem2=" + tem2 + "]";
	}
	
	public Weather() {
		// TODO Auto-generated constructor stub
	}

}
