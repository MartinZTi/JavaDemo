package com.mzt.demoTest;

import org.junit.Test;

/**
 * 测试循环结构
 * @author owen
 *
 */
public class TestCircle {

	public static void main(String[] args) {
		
	}
	
	@Test
	public void testFor() {
		for (int i = 1; i <= 150; i++) {
			String s = "";
			if(i%3==0) {
				s+=" foo";
			}
			if(i%5==0) {
				s+=" biz";
			}
			if(i%7==0) {
				s+=" baz";
			}
			System.out.println(i+s);
		}
	}
	
	@Test
	public void test02() {
		int count = 0;
		int sum = 0 ;
		for (int i = 1; i <=100; i++) {
			if(i%7==0) {
				count++;
				sum+=i;
			}
		}
		System.out.println(count+",sum="+sum);
	}
	
	
}
