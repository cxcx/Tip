package com.test;

import com.JsonTools.JsonTools;
import com.service.JsonService;
import com.service.Weather;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args 
	 * 测试构建json对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonService jsonService = new JsonService();
		Weather weather = jsonService.getWeather();
		String weatherString = JsonTools.CreatJsonString("weatherInfo", weather);
		System.out.println(weatherString);
	}

}
