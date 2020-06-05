package com.mzt.set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Test;

public class LinkedHashSetDemo {

	/*
	 * 测试 LinkedHashSet (链表+ 哈希表) 的
	 *  1.唯一性 和 
	 *  2.有序性
	 */
	@Test
	public void testUniqueAndOrder() {
		HashSet<Student> linkedHashSet = new LinkedHashSet<Student>();
		//存储
		linkedHashSet.add(new Student("一凡",18));
		linkedHashSet.add(new Student("二丫",20));
		linkedHashSet.add(new Student("三傻",30));
		linkedHashSet.add(new Student("一凡",19));
		linkedHashSet.add(new Student("一凡",18)); //重复元素
		
		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
		
		
	}
	
}
