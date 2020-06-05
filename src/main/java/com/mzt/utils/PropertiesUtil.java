package com.mzt.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	/*
	 * 1.读取项目根路径下的配置文件umpCfg/xxxx.properties  
	 * 2.====> new Properties()对象
	 * 3.prop.getProperty().trim   可以得到配置文件中的K:V 值
	 */
	public Properties getPropertiesValue(String propertiesName) {
		String path1 = this.getClass().getResource("/").getPath();
//		System.out.println(path1);
		String path2 = path1.substring(0, path1.indexOf("classes"))
				+ "classes/umpCfg/"+propertiesName+".properties";
//		System.out.println(path2);
//		/D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/
//		/D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/umpCfg/mspConfig.properties
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File(path2)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public static void main(String[] args) {
		PropertiesUtil pu = new PropertiesUtil();
		Properties prop = pu.getPropertiesValue("mspConfig");
		String ip = prop.getProperty("ip").trim();
		String port = prop.getProperty("port").trim();
		System.out.println("ip+port="+ip+":"+port);//ip+port=192.168.3.33:8080
		int i = 50/100;
	}
}
