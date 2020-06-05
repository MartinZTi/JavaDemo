package com.mzt.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * 时间处理
 */
public class TimeDateUtil {

	public final static SimpleDateFormat YMDHMS = new SimpleDateFormat("yyyyMMddHHmmss");
	public final static SimpleDateFormat YMDHMsS = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	public final static SimpleDateFormat Y_M_D_H_M_S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public final static SimpleDateFormat YMD = new SimpleDateFormat("yyyyMMdd");
	public final static SimpleDateFormat Y_M_D = new SimpleDateFormat("yyyy-MM-dd");
	public final static SimpleDateFormat HMS = new SimpleDateFormat("HHmmss");
	
	//yyyyMMddHHmmss
	public static String getTimeYMDHMS() {
		return YMDHMS.format(new Date());
	}
	//yyyyMMddHHmmssSSS
	public static String getTimeYMDHMsS() {
		return YMDHMsS.format(new Date());
	}
	//yyyy-MM-dd HH:mm:ss
	public static String getTimeY_M_D_H_M_S() {
		return Y_M_D_H_M_S.format(new Date());
	}
	//yyyyMMdd
	public static String getTimeYMD() {
		return YMD.format(new Date());
	}
	//yyyy-MM-dd
	public static String getTimeY_M_D() {
		return Y_M_D.format(new Date());
	}
	//HHmmss
	public static String getTimeHMS() {
		return HMS.format(new Date());
	}
	
	//'yyyyMMdd'    >>>>    date
	public static Date getDateYMD(String str) throws ParseException {
		return YMD.parse(str);
	}
	
	/*
	 * 精确计算两个日期之间相差的天数
	 */
	public static int diffOfTwoDate(Date first,Date second) {
		if(first.after(second)) {
			Date tmp = null;
			tmp = first;
			first = second;
			second = tmp;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(first);
		int cnt = 0;
		while(calendar.getTime().compareTo(second)!= 0) {
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			cnt++;
		}
		return cnt;
	}
	
	
	
	
	//精确日期差(带小数）
	public static String calcDayOffset(Date first,Date second) {
		long diffTimeStamp = 0;
		
		diffTimeStamp = second.getTime() - first.getTime();
		System.err.print("时间差"+diffTimeStamp+"\r\n");
		if(diffTimeStamp< 0) {
			diffTimeStamp = 0 - diffTimeStamp;
		}
		
		DecimalFormat format = new DecimalFormat(".00");
		double i = diffTimeStamp / (24*60*60*1000D);
		System.out.println(i);
		return format.format(i);
		
	}
	
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(TimeDateUtil.getTimeYMDHMS());//20191224152430
		System.out.println(TimeDateUtil.getTimeYMDHMsS());//20191224152547046
		System.out.println(TimeDateUtil.getTimeY_M_D_H_M_S());//2019-12-24 15:26:49
		System.out.println(TimeDateUtil.getTimeYMD());//20191224
		System.out.println(TimeDateUtil.getTimeY_M_D());//2019-12-24
		System.out.println(TimeDateUtil.getTimeHMS());//153016
		
		Date dateYMD = TimeDateUtil.getDateYMD("20191224");
		System.out.println(dateYMD);//Tue Dec 24 00:00:00 CST 2019
		
		//test  diffbetweenTwoDates
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2019-12-27 01:00:00");
		Date date2 = sdf.parse("2019-12-25 10:00:00");
//		String diffOfTwoDate = TimeDateUtil.calcDayOffset(date1, date2);
		int diffOfTwoDate = TimeDateUtil.diffOfTwoDate(date1, date2);
		System.out.println("相差的天数为："+diffOfTwoDate);//1069
		
		
	}
	
}
