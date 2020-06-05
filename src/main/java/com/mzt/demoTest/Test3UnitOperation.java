package com.mzt.demoTest;

import org.junit.Test;

/**
 * 测试三元运算符
 * @author owen
 *
 */
public class Test3UnitOperation {

	@Test
	public void test3UnitOperation() {
		
		//(条件表达式)？ 表达式1:  表达式2 ;
		boolean love = true;
		String result = love == true ? "在一起！": "分手吧！";
		System.out.println(result);
		
	}
	
	@Test
	public void exer3UnitOperation() {
		int n1 = 2,n2 = 3, n3 = 11;
		int max = n1>(n2>n3?n2:n3)?n1:(n2>n3?n2:n3);
		System.out.println(max);
		
		
	}
	
	
	
}
