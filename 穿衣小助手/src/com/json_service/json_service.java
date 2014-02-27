package com.json_service;

import java.io.BufferedInputStream;
import java.io.InputStream;

import httpService.getInternet;

public class json_service {
	
	getInternet getInputstream = new getInternet();
	InputStream inputStream = getInputstream.getInputStream();
	BufferedInputStream bufferstream = new BufferedInputStream(inputStream);
	
	public json_service() {
		// TODO Auto-generated constructor stub
	}

}
