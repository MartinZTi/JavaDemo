package com.mzt.demoTest;

import java.io.File;

/**
 *	测试遍历文件夹（内含zip文件） 
 * @author owen
 *
 */

public class TestTraversalFile {

	public static void main(String[] args) {
		
		String fileName = "D:\\U盘资料\\尚硅谷\\尚硅谷大数据线下班全套视频（2019年6月毕业班）\\000JavaSe";
		File file = new File(fileName);
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			String name = file2.getName();
			System.out.println(name);
		}
		
	}
	
}
