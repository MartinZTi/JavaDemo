package com.mzt.array;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
/**
 * 数组的常见算法
 * 1.特征值 
 * 2.复制、反转、查找
 * 3.排序
 * @author owen
 */
public class Demo3ArithmeticOfArray {
	public static void main(String[] args) {
		
	}
	
	//算法:测试数组元素的特征值
	@Test
	public void testCharacteristicValue() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(30)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//最大值
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("数组中的最大值为："+max);
		//最小值
		int min =  arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println("数组中元素的最小值为："+min);
		//平均值
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum /arr.length;        //**这里很关键,java整数相除,结果也为整型,先将某个数改为double
		System.out.println("数组中元素的平均值："+avg);
		//和值
		System.out.println("数组中元素的和值："+sum);
		
	}

	//算法:数组的复制(直接赋值"=")
	@Test
	public void testCloneOfArray() {
		int[] array1,array2;
		array1 = new int[] {2,3,5,7,11,13,17,19};
		System.out.println(Arrays.toString(array1));
		
		//赋值array2变量等于array1
		array2 = array1;
		for (int i = 0; i < array2.length; i++) {
			if(i%2==0) {
				array2[i] = i;
			}
		}
		System.out.println("array2遍历:"+Arrays.toString(array2));
		System.out.println("array1遍历:"+Arrays.toString(array1)+"\t--原数组中的元素被修改了,引用类型元素赋值“=”只传递地址值,一共就一份内存数组");
		System.out.println("\n\n\n***********************************************");
		/*
		 * 正真的数组之间的复制
		 */
		array2 = null;
		System.out.println("原来的array1:"+Arrays.toString(array1));
		System.out.println("原来的array2:"+Arrays.toString(array2));
		//"new"才会开辟内存空间 
		array2 = new int[array1.length];
		for (int i = 0; i < array2.length; i++) {
			array2[i]=array1[i];
		}
		System.out.println("复制array1后的array2:"+Arrays.toString(array2));
		System.out.println("数组复制后, 修改原数组array1中的元素都为0,再遍历两个数组array1,2:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = 0;
		}
		System.out.println("array1:"+Arrays.toString(array1));
		System.out.println("array2:"+Arrays.toString(array2));
	}
	
	//算法:数组的反转
	@Test
	public void testReversalOfArray() {
		String[] arr = new String[] {"GG","JJ","DD","MM","AA","BB"};
		//1.复制(产生一个新数组)
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println("反转前: "+Arrays.toString(arr1));
		//2.反转
		for(int start = 0,end = arr.length-1;start<end;start++,end--) {
			String temp = null;
			temp = arr1[start];
			arr1[start] = arr1[end];
			arr1[end] = temp;
		}
		System.out.println("反转后: "+Arrays.toString(arr1));
	}

	//算法:数组的查找(方式一：线性查找)
	@Test
	public void testSearchOfArray01(){
//		方式一:线性查找, 一个一个找
		String[] arr = new String[] {"GG","JJ","DD","MM","AA","BB"};
		String str = "MM";
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(str == arr[i]) {
				System.out.println("数组arr中存在目标元素,索引位置："+i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("数组arr中  不存在  目标元素");
		}
	}

	//算法:数组的查找(方式二：二分法查找)(前提是数组元素有序)
	@Test
	public void testSearchOfArray02() {
		int[] arr = new int[] {2,34,44,64,78,88,89,90,92,99,123,234,355};
		int value = 33;
		int head = 0;
		int end = arr.length-1;
		boolean flag = false;
		while(head<= end) {
			int middle = (head+end)/2;
			if(arr[middle]==value) {
				System.out.println("数据以找到，索引为:"+middle);
				flag = true;
				break;
			}else if(arr[middle] > value){
				end = middle-1;
			}else {
				head = middle+1;
			}
		}
		if(!flag) {
			System.out.println("数据未找到");
		}
	}
	
	//算法:数组的排序算法(冒泡、快速, 其他还有好几种)
	@Test
	public void testSortOfArray() {
		//冒泡排序
		int[] arr = new int[] {23,445,34,63,-73,-1,0,2,99,445};
		//從小打大
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
		
	
	//算法: 快速排序
	@Test
	public void testQuickSortOfArray() {
		
	}
}
	










