package com.mzt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class ImageCopy {

	@Test
	public void ImgCopy() throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("D:\\Workspaces\\eclipse-workspace(UTF-8)\\DemoStudy\\src\\main\\java\\com\\mzt\\IO\\FileInputStream\\file\\bg_wx.png"));
		
		FileOutputStream fos = new FileOutputStream(new File("D:\\Workspaces\\eclipse-workspace(UTF-8)\\DemoStudy\\src\\main\\java\\com\\mzt\\IO\\FileOutputStream\\file\\bg_copy.jpg"));
		
		int len = 0;
		byte[] b = new byte[1024];
		while((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);	
		}
		
		fos.close();
		fis.close();
		
	}
	
}
