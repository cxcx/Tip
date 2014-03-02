package com.example.tipforclothes;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.json_service.json_service;
import com.wether.Weather;

import httpService.getInternet;
import android.os.Bundle;
import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		textView = (TextView) findViewById(R.id.text);
		getInternet getinternet = new getInternet();
		InputStream inputStream = getinternet.getInputStream();
		String jsonString = getinternet.changeInputstream(inputStream);
		JSONObject jsonObject;
		try {
			jsonObject = json_service.get_jsonObject("weatherinfo", jsonString);
			String city = jsonObject.getString("city");
			String temp_H = jsonObject.getString("temp1");
			String temp_L = jsonObject.getString("temp2");
			String weather = jsonObject.getString("weather");
			textView.setText(city+"\n"+temp_H+"\n"+temp_L+"\n"+weather);
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
