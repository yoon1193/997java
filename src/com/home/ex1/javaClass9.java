package com.home.ex1;

public class javaClass9 {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//1번
		System.out.println("야구장 좌석수는:");
		String s1 = sc.nextLine();
		double d1 = Double.parseDouble(s1);
		System.out.println("야구장의 관객수는:");
		s1 = sc.nextLine();
		double d2 = Double.parseDouble(s1);		
		System.out.println(String.format("입장률은 %.1f%% 입니다", (d2/d1)*100));
		
		
		//2번
		System.out.println("시간을 입력하세요:");
		String s2 = sc.nextLine();
		double d3 = Double.parseDouble(s2);
		int hour = (int)d3;  // 시간
		int min = (int)((((d3*100)%100)/100)*60);
		d3 = ((((d3*100)%100)/100)*60);
		int sec = (int)((((d3*100)%100)/100)*60);
		System.out.println(String.format("지금 시간은 %d시간 %d분 %d초 입니다",hour,min,sec));
		
		
		//도전1
		System.out.println("몸무게(kg)와 키(cm) 입력:");
		String s3 = sc.nextLine();
		double d4 = Double.parseDouble(s3);
		s3 = sc.nextLine();
		double d5 = Double.parseDouble(s3);
		d5 = d5/100;
		double B = d4/(d5*d5);
		if(B>=20.0 && B<25.0  )
			System.out.println("표쥰입니다.");
		else			
			System.out.println("관리가 필요합니다.");
			
			
		//도전2
		System.out.println("세 개의 물건값을 입력하세요:");
		String s4 = sc.nextLine();
		int i1 = Integer.parseInt(s4);
		s4 = sc.nextLine();
		int i2 = Integer.parseInt(s4);
		s4 = sc.nextLine();
		int i3 = Integer.parseInt(s4);
		int c = 10000 - (i1+i2+i3);
		System.out.println(String.format("거스름돈은 %d 입니다",c));
		System.out.println("오천원권:" + c/5000);
		System.out.println("천원권:" + (c%5000)/1000);
		System.out.println("오백원짜리 동전:" + (c%5000%1000)/500);
		System.out.println("백원짜리 동전:" + (c%5000%1000%500)/100);
		System.out.println("오십원짜리 동전:" + (c%5000%1000%500%100)/50);
		System.out.println("십원짜리 동전:" + (c%5000%1000%500%100%50)/10);
		
		
		//도전3
		System.out.println("거리와 속력 입력:");
		String s5 = sc.nextLine();
		int i4 = Integer.parseInt(s5);
		s5 = sc.nextLine();
		int i5 = Integer.parseInt(s5);
		double t = (double)i4/(double)i5;
		int hour1 = (int)t;
		int min1 = (int)((((t*100)%100)/100)*60);
		t = ((((t*100)%100)/100)*60);
		double sec1 = ((((t*100)%100)/100)*60);
		System.out.println(String.format("소요시간은 %d시간 %d분 %.3f 초입니다",hour1,min1,sec1));
		
		
		sc.close();
		
	}

}
