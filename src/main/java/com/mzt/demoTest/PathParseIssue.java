package com.mzt.demoTest;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

public class PathParseIssue {
	String archivePath = "";
	String batch = "";
	String file_name = "";
	@Test
	public void test01() {
		String path1 = "/20200316/99536343/37834461/12345.MOV";
		String path2 = "/2020/20200520/95973450/KAEFDSFJDJ/610632197811096253.mp4";
		//再长一点呢？
		String path3 = "/2020/05/20200520/95973450/KAEFDSFJDJ/610632197811096253.mp4";
		
		String path4 = "/2020/batch/12345.jpg";
		
//		pathParse(path1);
		arrayParse(path4);
	}
	
	public void arrayParse(String path) {
		System.out.println("path=" + path);
		if(path != null && path.length() > 0) {
			String[] str = path.split("/");
			System.out.println(str.length);
			if(str.length >= 4) {
//				String[] str = path.split(File.separator);
				System.out.println(Arrays.toString(str));
				
				file_name = str[str.length-1];
				System.out.println("file_name= "+file_name);
				
				
				batch = str[str.length-2];
				System.out.println("batch= "+batch);
				
				//batch之前的都是archviePath
				System.out.println(path.indexOf(str[str.length-2]));
				archivePath = path.substring(0, path.indexOf(str[str.length-2])-1);
				System.out.println("archivePath= "+archivePath);
			}
				
		}
		
		
		

	}
	
	
	
	//"/"拆分后起码 有3个元素  来验证
	public void pathParse(String path) {
		int len = path.split("/").length;
		
		if(len >= 4) {
		//最后一个分隔符后面是  文件名file_name
		file_name = path.substring(path.lastIndexOf("/")+1, path.length());
		System.out.println(file_name);
		
		//最后一个分隔父 ~ 最后第二个
		
		
		}
	}
	
}


















