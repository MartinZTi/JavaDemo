package com.mzt.IO.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo {

	@Test
	public void testFileOutputStream() throws IOException {
		/*
		 * 文件输出流: 用于将数据写出到文件
		 */
		FileOutputStream fos = new FileOutputStream(new File("D:\\Workspaces\\eclipse-workspace(UTF-8)\\DemoStudy\\src\\main\\java\\com\\mzt\\IO\\FileOutputStream\\file\\b.txt"));
//		FileOutputStream fos = new FileOutputStream(new File("abc.txt"));
		
//		FileOutputStream fos1 = new FileOutputStream("D:\\Workspaces\\eclipse-workspace(UTF-8)\\DemoStudy\\src\\main\\java\\com\\mzt\\IO\\FileOutputStream\\file\\b.txt");
		//方法一  write(int a)
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		fos.close();
	
		//方法二: write(byte[] b)
		
//		fos.write("java程序员".getBytes());
//		fos.close();
		
		//方法三: 
		//`write(byte[] b, int off, int len)`
		
		byte[] b = "abcde".getBytes();
		fos.write(b, 1, 3);
		fos.close();//bcd
		
	}
	
}
