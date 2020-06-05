package com.mzt.thread;

import org.junit.Test;

public class TestCreateThread {

	@Test
	public void testCreateThread() {
		
		System.out.println("这里是main线程");
		MyThread mt = new MyThread("雄安强");
		mt.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("的风景"+i);
		}
		
	}
	
}

