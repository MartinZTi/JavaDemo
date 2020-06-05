package com.mzt.timeFormatTransform;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.junit.Test;

public class TestStampAndDate {

	@Test
	public void test01() {
		
		long currentTimeMillis = System.currentTimeMillis();
		String currdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println("正常的时间str= "+ currdate);
		System.out.println(currentTimeMillis);
		String stampStr = ""+currentTimeMillis;
		
		String date = stampToDate(stampStr);
		
		System.out.println(date);
		
	}

	private String stampToDate(String stampStr) {
		
		Long stamp = new Long(stampStr);
		Date date = new Date(stamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(date);
		return dateStr;
	}
	
	
	
}
