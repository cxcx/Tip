package com.JsonTools;

import com.alibaba.fastjson.JSONObject;

public class JsonTools {

	public JsonTools() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param key
	 *            json对象的键名；
	 * @param value
	 *            json对象的键值；
	 * @return
	 */
	public static String CreatJsonString(String key, Object value) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key, value);
		return jsonObject.toJSONString();

	}

}
