package com.mzt.httpMicroServiceCall;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;
import com.mzt.utils.PropertiesUtil;

public class CommonMethod {

	@SuppressWarnings("unchecked")
	public Map<String,Object> conn(Map query,String propertiesName,String propertiesKeyPath,String reqType){
		//hcu里定义了发送Http请求的connUrl方法
		HttpClientUtil hcu = new HttpClientUtil();
		//data封装响应结果信息
		HashMap<String, Object> data = new HashMap<String,Object>();
		
		PropertiesUtil pu = new PropertiesUtil();
		Properties prop = pu.getPropertiesValue(propertiesName);
		String ip = prop.getProperty("ip").trim();
		String port = prop.getProperty("port").trim();
		String urlPath = prop.getProperty(propertiesKeyPath);

		//响应信息(若不为null/"")
		JSONObject resData = new JSONObject();

		try {
			String a = hcu.connUrl(query, ip, port, urlPath, reqType);
			//打印log
			if(a==null || "".equals(a)) {
				data.put("returnCode", "0");
				data.put("returnMessage", "无返回数据");
				return data;
			}
//			resData = JSONObject.parseObject(a);
			StringBuffer sb = new StringBuffer();
			sb.append("{"+"\"resData\""+":").append("\""+a+"\"").append("}");
			System.out.println(sb.toString());
			resData = JSONObject.parseObject(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			data.put("returnCode", "0");
			data.put("returnMessage", "502,请求微服务失败");
			return data;
		}
		String status = resData.getString("status");
		if(status!=null) {
			data.put("returnCode", "0");
			data.put("returnMessage","404,NotFound");
			return data;
		}
		data.put("resData", resData);
		return data;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> query = new HashMap<String,String>();
		query.put("name", "owen");
		query.put("passwd", "1234");
		
		String propertiesName = "mspConfig";
		String propertiesKeyPath = "microServerPath";
		String reqType = "get";
		
		Map<String, Object> data = new CommonMethod().conn(query, propertiesName, propertiesKeyPath, reqType);
		Set<Entry<String,Object>> entrySet = data.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue().toString()+"\r\n");
		}
		
		
	}
	
}
