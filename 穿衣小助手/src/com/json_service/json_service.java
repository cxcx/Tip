package com.json_service;

import java.io.BufferedInputStream;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;

import android.R.integer;
import httpService.getInternet;

public class json_service {

	public json_service() {
		// TODO Auto-generated constructor stub
	}

	public static JSONObject get_jsonObject(String key, String string)
			throws JSONException {
		JSONObject jsonObject = new JSONObject(string);
		JSONObject object = jsonObject.getJSONObject(key);
		return object;
	}

	public static String CreatJsonString(JSONObject jsonObject) {
		return jsonObject.toString();
	}
}
