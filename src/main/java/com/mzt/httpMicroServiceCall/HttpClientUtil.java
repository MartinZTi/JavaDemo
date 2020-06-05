package com.mzt.httpMicroServiceCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientUtil {
	

	public String connUrl(Map<String,String> query,String ip,String port,String urlPath,String reqType) throws Exception {
		//可闭合的HttpClient的实例
		String resData = null;
		CloseableHttpClient client = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		
		try {

			//普通get请求
			if("get".equals(reqType)) {
				ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();	//BasicNameValuePair是实现类
				Set<Entry<String,String>> entrySet = query.entrySet();
				for (Entry<String, String> entry : entrySet) {
					nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
				}
				URIBuilder url = new URIBuilder("http://"+ip+":"+port+urlPath);
				url.addParameters(nvps);
				HttpGet httpGet = new HttpGet(url.build());
				response = client.execute(httpGet);
			}
			
			HttpEntity entity = response.getEntity();
			resData = EntityUtils.toString(entity, "utf-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resData;
	}

	@Test
	public void testExecuteGetReq() {
		HashMap<String, String> query = new HashMap<String, String>();
//		query.put("name", "测试测试");
		String ip = "127.0.0.1";
		String port = "80";
		String urlPath = "/hello";
		String reqType = "get";
		try {
			String resDate = new HttpClientUtil().connUrl(query, ip, port, urlPath, reqType);
			System.out.println(resDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
