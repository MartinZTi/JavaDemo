package com.mzt.set.HashSet;

import java.util.HashSet;

import org.junit.Test;

public class HashSetDemo {

	@Test
	public void testHashSet() {
		//创建集合
		HashSet<String> set = new  HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("aaa"); //重复元素
		
		//遍历
		for (String string : set) {
			System.out.println(string);
		}
		
		
	}
	
}
