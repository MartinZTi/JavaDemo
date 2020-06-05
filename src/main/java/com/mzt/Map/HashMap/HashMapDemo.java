package com.mzt.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class HashMapDemo {

	@Test
	public void testEntrySet() {
		//创建hashMap集合对象
		Map<Student,String> map = new HashMap<Student,String>();
		//2.添加元素
		map.put(new Student("一凡",18), "上海");
		map.put(new Student("三傻",20), "北京");
		map.put(new Student("赵四",18), "苏州");
		map.put(new Student("五一",18), "上海");
		map.put(new Student("一凡",18), "杭州");
		
		//遍历--键找值方式
		Set<Student> keySet = map.keySet();
		for (Student key : keySet) {
			String value = map.get(key);
			System.out.println("key:"+key.toString()+"----value:"+value);
		}
	}
	
	
}
