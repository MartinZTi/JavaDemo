package com.mzt.demoTest;
/**
 * 测试使用Scanner类
 * @author owen
 *
 *	1.Scanner不能获取Char类型变量, 而可以获取String
 *	2.接收类型和 输入类型不匹配时：InputMisMatchException
 *
 */
//1.导包
import java.util.Scanner;

import org.junit.Test;
public class TestScanner {

	public static void main(String[] args) {
		//2.实例化
		Scanner scan = new Scanner(System.in);
		//3.调用Scanner类提供的相关方法，获取不同类型的变量
		System.out.println("请输入：");
		String str = scan.nextLine();
		System.out.println(str);
	}
	
	//测试if..else
	@Test
	public void testIfelse() {
		int score = 60;
		String reward = null;
		if(score == 100) {
			reward = "奖励一辆BWM";
		}else if(score > 80) {
			reward = "iphoneXs Max";
		}else if(score >=60) {
			reward = "iPad";
		}else {
			reward = "nothing";
		}
		
		System.out.println(reward);
	}
	
	@Test
	public void testIfelse2() {
		/**
		 * 编写程序：由键盘输入3个整数分别存入变量num1，num2，num3
		 * 对三者进行排序（使用if-else if..else), 从小到大输出。
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第1个数:");
		int num1 = scan.nextInt();
		System.out.println("请输入第2个数:");
		int num2 = scan.nextInt();
		System.out.println("请输入第3个数:");
		int num3 = scan.nextInt();
		
		if(num1>=num2) {
			if(num3 > num1) {
				System.out.println(num3+","+num1+","+num2);
			}else if(num3< num2) {
				System.out.println(num1+","+num2+","+num3);
			}else {
				System.out.println(num1+","+num3+","+num2);
			}
		}else {
			if(num3>num2) {
				System.out.println(num3+","+num2+","+num1);
			}else if(num3>=num1) {
				System.out.println(num2+","+num3+","+num1);
			}else {
				System.out.println(num2+","+num1+","+num3);
			}
		}
	}
	
	@Test
	public void test03(){
		boolean b = true;
		if(b = false)//赋值语句， 将false赋值给b,所以b的值为false,不执行if代码块
			System.out.println("a");
		else if(b) 
			System.out.println("b");
		else if(!b)
			System.out.println("c");//答案是c
		else
			System.out.println("d");
	}
	
	
	
}
