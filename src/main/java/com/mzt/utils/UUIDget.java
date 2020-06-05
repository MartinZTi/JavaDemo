package com.mzt.utils;

import java.util.UUID;

public class UUIDget {

	public static void main(String[] args) {
		
		String uuid = UUID.randomUUID().toString().replace("-", "");
		System.out.println(uuid);
		
	}
	
}
