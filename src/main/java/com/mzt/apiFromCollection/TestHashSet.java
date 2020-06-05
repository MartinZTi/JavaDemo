package com.mzt.apiFromCollection;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;


/**
 * HashSet简介:它是最流行的Set实现之一
 * 
 * 1.元素唯一且允许空值
 * 2.它由HashMap支持,   HashSet构造方法中会创建一个HashMap
 * 3.无序的,  它不保持插入顺序
 * 4.线程不安全
 * 
 * @author owen
 *
 */
public class TestHashSet {
	
	//add()方法
	@Test
	public void whenAddingElement() {
		HashSet<String> hashSet = new HashSet<String>();
		assertTrue(hashSet.add("String Added"));
	}

	//contains()方法
	@Test
	public void whenCheckingForElement() {
		HashSet<String> hashsetContains = new HashSet<String>();
		hashsetContains.add("String Added");
		
		assertTrue(hashsetContains.contains("String Added"));
	}
	
	//remove()方法
	@Test
	public void whenRemovingElement() {
		HashSet<String> removeFromHashSet = new HashSet<String>();
		removeFromHashSet.add("String Added");
		
		assertTrue(removeFromHashSet.remove("String Added"));
	}
	
	//clear()方法 & isEmpty()
	@Test
	public void whenClearingHashSet() {
		HashSet<String> clearHashSet = new HashSet<String>();
		clearHashSet.add("String Added");
		clearHashSet.clear();
		
		assertTrue(clearHashSet.isEmpty());
	}
	
	//size()方法
	@Test
	public void whenCheckingTheSizeOfHashSet() {
		HashSet<String> hashSetSize = new HashSet<String>();
		hashSetSize.add("String Added");

		System.out.println(hashSetSize.size());
	}
	
	/*
	 * 如果在通过迭代器中，我们只能通过迭代器的remove方法删除元素，
	 * 在创建迭代器之后的任何时间修改集合，则迭代器会抛出ConcurrentModificationException
	 */
	//Iterator()
	@Test
	public void whenIteratingHashSet() {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		Iterator<String> itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			hashset.remove("a");
		}
	}
	
	
	
	
}
