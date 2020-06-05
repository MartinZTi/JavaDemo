package com.mzt.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.mzt.Map.HashMap.Student;

public class LinkedHashMapDemo {

	@Test
	public void testLinkedHashMap() {
		Map<Student, String> linked = new LinkedHashMap<Student,String>();
		linked.put(new Student("一凡",18), "上海");
		linked.put(new Student("二丫",15), "广州");
		linked.put(new Student("三傻",16), "四川");
		linked.put(new Student("赵四",20), "贵州");
		linked.put(new Student("一凡",18), "江苏");
		
		//entry遍历map集合
		Set<Entry<Student,String>> entrySet = linked.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+key.toString()+"----"+value);
		}
	}
}
