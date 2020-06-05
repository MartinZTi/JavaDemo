package com.mzt.list.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListDemo {

	/*
	 * LinkedList集合有针对首位元素的操作，可以作为堆栈使用 
	 */
	@Test
	public void testLinkedListAsStackOrHeap() {
		LinkedList<String> link = new LinkedList<String>();
		//添加
		link.addFirst("aaa");
		link.add("bbb");
		link.addLast("ccc");
		System.out.println(link);
		//查(普通list接口方法)
//		String link3 = link.get(2);
//		System.out.println(link3);
		//查*特有
		System.out.println(link.getFirst());
		//删除
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		while(!link.isEmpty()) {
			System.out.println(link.pop());//弹出集合中的栈顶元素
		}
		System.out.println(link);
		
		
//		Object[] array = link.toArray();
//		System.out.println(Arrays.toString(array));
		
		
	}
	
	
}
