package com.mzt.IO.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo {

	
	//Properties  继承 Hashtable
	@Test
	public void testProperties() throws IOException {
		Properties prop = new Properties();
		prop.setProperty("db.username", "root");
		prop.setProperty("db.password", "root");
		prop.setProperty("db.driverClassName", "com.mysql.jdbc.Driver");
		prop.setProperty("db.url", "jdbc:mysql://192.168.3.33:3306/edp");
		
		//遍历  键找值
		Set<Entry<Object,Object>> entrySet = prop.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println("key:"+key+"--\t\tvalue:"+value);
		}
		
		FileOutputStream fos = new FileOutputStream(new File("jdbc.properties"));
		prop.store(fos, "数据源配置文件");	
		fos.close();
		
	}
	
	
}
