package com.mzt.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	/*
	 * ParsePosition ppos = new ParsePosition(8);
	 * sd 从String的第几位开始读取
	 */
	
	public static Date getNowDate() {
		Date currentTime = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = simpleDateFormat.format(currentTime);
		System.out.println(dateStr);
		ParsePosition ppos = new ParsePosition(8);
		Date currentTime_2 = simpleDateFormat.parse(dateStr, ppos);
		
		return currentTime_2;
	}

	
	public static void main(String[] args) {
		Date nowDate = DateUtils.getNowDate();
		System.out.println(nowDate);
//		ppos(0)  Tue Dec 24 11:57:02 CST 2019
//		ppos(1)  Sun Dec 24 11:58:57 CST 19
//		ppos(2)  Sun Dec 24 11:59:55 CST 19
//		ppos(3)  Tue Dec 24 12:00:27 CST 9		:2019-12-24 12:00:27
//		ppos(4)  null
//		ppos(5)  null
	}
}
