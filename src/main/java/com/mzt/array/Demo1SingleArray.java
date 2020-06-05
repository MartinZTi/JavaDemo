package com.mzt.array;

import java.util.Arrays;

import org.junit.Test;

/**
 * 一维数组的使用
 * @author owen
 *
 */
public class Demo1SingleArray {
	public static void main(String[] args) {
		//1.数组的声明和初始化
//方式一：静态初始化, 数组的初始化和元素的赋值同时进行。
		int[] arr1;//声明，未赋值
		//初始化
		arr1 = new int[]{1,2,3,4};
		System.out.println(Arrays.toString(arr1));
//方式二：动态初始化, 数组的初始化和元素的赋值分步进行。	
		int[] arr2 = new int[4];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr2.length);
	}
	
	//测试遍历数组
	@Test
	public void testTraversalArray() {
		int[] arr1 = {1,2,3,4,5,6,7,8};
		//方式一: for循环遍历
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		//方式二: 工具类Arrays的方法
		String result = Arrays.toString(arr1);
		System.out.println(result);
	}
	
	//测试遍历  只声明长度,元素未赋值的数组
	@Test
	public void testTraversalArrayWithoutFuZhi() {
		//测试引用类型
		String[] arr1 = new String[5];
		System.out.println(Arrays.toString(arr1));
		//[null, null, null, null, null]
		
		//测试整型
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2));
		//[0, 0, 0, 0]
		
		//测试浮点型
		float[] arr3 = new float[4];
		System.out.println(Arrays.toString(arr3));
		//[0.0, 0.0, 0.0, 0.0]
		
		//测试字符型
		char[] arr4 = new char[4];
		System.out.println(Arrays.toString(arr4));
		//[ , , ,]
		
		//测试布尔型
		boolean[] arr5 = new boolean[4];
		System.out.println(Arrays.toString(arr5));
		//[false, false, false, false]
	}
	
	
}
