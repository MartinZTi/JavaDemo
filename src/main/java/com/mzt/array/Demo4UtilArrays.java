package com.mzt.array;

import java.util.Arrays;

import org.junit.Test;

/**
 * 	测试Arrays工具类中的方法
 * @author owen
 */
public class Demo4UtilArrays {
	public static void main(String[] args) {
		
	}
	//一、判断相同数组 boolean equals(int[] a, int[] b)
	@Test
	public void test01() {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,2,3,4};
		boolean result = Arrays.equals(arr1, arr2);
		System.out.println (result);
	}
	
	//二、数组打印toString()
	@Test
	public void test02() {
		int[] arr1 = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(arr1));
	}
	
	//三、fill()填充
	@Test
	public void test03() {
		int[] arr1 = new int[] {1,2,3,4};
		Arrays.fill(arr1, 3);
		System.out.println(Arrays.toString(arr1));
	}
	//四、sort() 排序, 底层快速排序
	@Test
	public void test04() {
		int[] arr1 = new int[] {31,1,34,4,-55,-1,0,99,3};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	//五、二分法查找binarySearch()
	@Test
	public void test05() {
		int[] arr1 = new int[] {31,1,34,4,-55,-1,0,99,3};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		int target = 8;
		int result = Arrays.binarySearch(arr1, target);
		System.out.println(result);
	}
	//六、数组复制copyOf(原数组, 新数组长度) ,会创建新数组
	@Test
	public void test06() {
		int[] arr1 = new int[] {31,1,34,4,-55,-1,0,99,3};
		int[] arr2 = Arrays.copyOf(arr1, 4);
		System.out.println(Arrays.toString(arr2));
	}
	
	//七、数组复制copyOfRange(原数组, from, to),会创建新数组
	@Test
	public void test07() {
		int[] arr1 = new int[] {31,1,34,4,-55,-1,0,99,3};
		int[] arr2 = Arrays.copyOfRange(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr2));
	}
	
}
