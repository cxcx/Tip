package httpService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.util.Log;

public class getInternet {
	private final String url_path = "http://m.weather.com.cn/data/101210101.html";
	public InputStream getInputStream() {
		InputStream inputStream = null;
		try {
			URL url = new URL(url_path);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setDoInput(true);
			int respond_code = httpURLConnection.getResponseCode();
			if(respond_code == httpURLConnection.HTTP_OK){
				inputStream = httpURLConnection.getInputStream();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Log.i("in", inputStream.toString());
		return inputStream;
	}
	public String changeInputstream(InputStream inputStream) {
		String jsonString = "";
		int len = 0;
		byte data[] = new byte[1024];
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			while((len = inputStream.read(data))!=-1)
			{
				byteArrayOutputStream.write(data, 0, len);				
			}					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jsonString = new String(byteArrayOutputStream.toByteArray());
		return jsonString;
	}
	
	public getInternet() {
		// TODO Auto-generated constructor stub
	}

}
