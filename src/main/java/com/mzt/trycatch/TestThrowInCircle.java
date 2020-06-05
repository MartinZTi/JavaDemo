package com.mzt.trycatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

/**
 * 测试循环中某步抛出异常时,循环中断 还是 继续执行
 * 借呗影像系统中,遍历txt入库新记录时若抛异常,catch后只是日志打印无 return/continue
 * 
 * 结论:  循环中某步出异常,catch中不return则继续执行后续循环
 * @author owen
 */
public class TestThrowInCircle {
	
	
	@Test
	public void test01(){
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("第"+i);
				
				if (i==3) {
					throw new Exception("====异常异常异常异常异常====");
				}
				
			} catch (Exception e) {
				System.err.print("循环第"+(i+1)+"步出了错,当前i的值"+i);
				//return;  终端循环
//				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test02() {
		
		outer:for (int j = 0; j < 5; j++) {
			try {
				System.out.println("\n外层循环,第"+(j+1)+"次循环");
				
				inner:for (int i = 0; i < 5; i++) {			//假设一个一个的txt文件
					try {
						System.out.println("[[-----内层循环,第"+i);
						
						if (j==2&&i==2) {
							throw new Exception("====异常异常异常异常异常====");  
						}
						System.out.println("-----后续代码");
						
					} catch (Exception e) {
						System.err.print("=======内层循环第"+(i+1)+"步出了错,当前i的值====="+i+"\n");
						
//						return;//中断循环/方法
						continue;//加continue无效果,会继续执行所有操作,实际情况是要停止当前这步的后续操作
//						break;//不可行
					}
					System.out.println("-----try..catch后续代码]]");
				}
				
				
			} catch (Exception e) {
				System.err.print("外层循环第"+(j+1)+"步出了错,当前i的值"+j);
			}
		}
		
	}
	
	@Test
	public void test03() {
		
		for (int j = 0; j < 5; j++) {
			System.out.println("\n解析第"+(j+1)+"个txt");
			try {		//total_trade>1000
				for (int i = 0; i < 5; i++) {
						System.out.println("i:"+i);//入库bem
					if (j==2&&i == 2) {						//模拟第3个txt内容入库bem异常时
						throw new Exception();
					}
				}
			} catch (Exception e) {
				System.err.println("-----入库bet:0,2,0,0,0------"); 
//				return;//当前项目代码,直接中断整个方法
				continue;//符合要求
			}
			System.out.println("bem入库的后续操作:total_trade入库bet 及txt转移到备份目录\n\n");//异常时,要求不能执行
		}
	}
	

	@Test
	public void test003() {
//		List<Object> emallTrades = new ArrayList<Object>();
//		int i = emallTrades.size();
//		System.out.println(i);
		
		HashMap<Object, Object> taskMap = new HashMap<Object,Object>();
		taskMap.put("total_trade", 0);
		Object totalTrade = taskMap.get("total_trade");
		System.out.println(totalTrade);
		
	}
	
	
	
	
	
}
