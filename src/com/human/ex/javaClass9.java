package com.human.ex;

public class javaClass9 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("야구장의 관객수는 몇명:?");
		String s1 = sc.nextLine();
		double d1 = Double.parseDouble(s1);
		System.out.println("입장률은"+(d1/70)*100+"%입니다.");
		
		System.out.println("시간입력:");
		String s2 = sc.nextLine();
		double d2 = Double.parseDouble(s2);
		//s2 = sc.nextLine();
		//double d3 = Double.parseDouble(s2);
		//s2 = sc.nextLine();
		//double d4 = Double.parseDouble(s2);
		System.out.println(d2/1+"시간"+d2+"분"+d2+"초");
		
		
		
		
		
		
		
		
		
		

	}

}
