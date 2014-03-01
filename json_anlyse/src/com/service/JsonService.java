package com.service;

import com.JsonTools.JsonTools;

public class JsonService {

	public JsonService() {
		// TODO Auto-generated constructor stub
	}

	public Weather getWeather() {
		Weather weather = new Weather("hangzhou", "3/1", "thick", 6, 16);
		return weather;

	}

}
