package com.mzt.array;

import java.util.Arrays;

/**
 * 二维数组
 * @author owen
 *
 */
public class Demo2DoubleArray {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
//静态初始化
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
//动态初始化
		int[][] arr1 = new int[3][];
		arr1[1] = new int[]{1,2,3};
		arr1[2] = new int[]{4,5,6};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		/*
		 	[0, 0]
			[1, 2, 3]
			[4, 5, 6]
		 */
		System.out.println(arr1[0].length);//空指针异常   arr1[0]=null,未指定长度
	}
}
