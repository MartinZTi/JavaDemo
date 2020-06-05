package com.mzt.IO.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriterDemo {

	/*
	 * 字符输出流的子实现类
	 */
	@Test
	public void testFileWriter() throws IOException {
		FileWriter fw = new FileWriter(new File("fileWriterDemo.txt"));
		fw.write(97);
		fw.write(100);
		fw.write(10000);
		fw.write(20000);
		/*
		 * 如果不调用 flush() 和 close() 方法, 待写出的数据只存在于 缓存区,并没有输出保存到文件
		 */
		
		//用flush() 不用等流关闭便会将 缓冲区的数据保存到文件
		fw.flush();
		fw.close();
	}
	
}
