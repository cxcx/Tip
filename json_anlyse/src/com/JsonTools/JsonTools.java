package com.JsonTools;

import com.alibaba.fastjson.JSONObject;

public class JsonTools {

	public JsonTools() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param key
	 *            json����ļ�����
	 * @param value
	 *            json����ļ�ֵ��
	 * @return
	 */
	public static String CreatJsonString(String key, Object value) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key, value);
		return jsonObject.toJSONString();

	}

}
