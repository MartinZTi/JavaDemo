package com.mzt.demoTest;

import java.util.Arrays;

/**
 * 测试方法split();
 * 借呗影像归档中: split("[,]");的用法
 * @author owen
 *
 *	结论:  split()中参数用[,] 和 ,  效果一样,都是逗号分隔成数组
 *
 */
public class TestSplit {

	public static void main(String[] args) {
		
		String text = "aaaaa,bbbb,cccc,dddd";
		
		String[] arr = text.split("[,]");
		/*
aaaaa
bbbb
cccc
dddd
		 */
		
		
		String[] arr1 = text.split(",");
		
		String[] arrnew = text.split("[,]", -1);
		System.out.println("arrnew: "+Arrays.toString(arrnew));
		System.out.println("-------");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}
	
}
