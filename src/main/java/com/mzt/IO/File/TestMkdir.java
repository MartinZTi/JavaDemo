package com.mzt.IO.File;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestMkdir {

	@Test
	public void test01() throws IOException {
		
		String parentDir= "D:\\demo\\file";
		
		String filename = parentDir+File.separator+"testMkdir\\abc.txt";
		
		File file = new File(filename);
		if(!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		
		
		
	}
	
	
	@Test
	public void test() {
		
		char a = 250;
		System.out.println(a);
	}
	
	
	
	
}
