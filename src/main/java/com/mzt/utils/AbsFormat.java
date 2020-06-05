package com.mzt.utils;

import java.util.Calendar;
import java.util.Date;

//得到当前的  小时时刻值       24小时制      例： 15
public class AbsFormat {

	public int formatDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	public static void main(String[] args) {
		
		AbsFormat format = new AbsFormat();
		Date date = new Date();//Tue Dec 24 15:00:26 CST 2019
		
		System.out.println(date);
		
		
		int date2 = format.formatDate(date);
		System.out.println(date2);//15
	}
	
}
