package com.wether;



public class Weather {

	private String city;
	private int tempL;
	private int tempH;
	private String weather;
	
	public Weather(String city, int tempL, int tempH, String weather) {
		super();
		this.city = city;
		this.tempL = tempL;
		this.tempH = tempH;
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "Weather [city=" + city + ", tempL=" + tempL + ", tempH="
				+ tempH + ", weather=" + weather + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTempL() {
		return tempL;
	}

	public void setTempL(int tempL) {
		this.tempL = tempL;
	}

	public int getTempH() {
		return tempH;
	}

	public void setTempH(int tempH) {
		this.tempH = tempH;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public Weather() {
		// TODO Auto-generated constructor stub
	}

}
