package com.mzt.demoTest;

import org.junit.Test;

/**
 * 测试位运算符中的  亦或 ^ 运算符
 * @author owen
 *	
 */
public class TestYiHuoYunSuanFu {

	@Test
	public void testYiHuo() {
		//亦或  位运算符  交换两个变量
		int m = 5;
		int n = 8;
		
		m = m^n;
		n = m^n;
		m = m^n;
		
		System.out.println("m 交换后="+m);//8
		System.out.println("n 交换后="+n);//5
		
	}
	
}
