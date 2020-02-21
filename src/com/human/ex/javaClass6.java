package com.human.ex;

public class javaClass6 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("키를 입력하시오(cm):");
		String s1 = sc.nextLine();
		double d1 = Double.parseDouble(s1);
		
		System.out.println("m로 변환된 결과는"+(d1/100)+"입니다");
		
		System.out.println("상자의 가로,세로,높이를 한번에 입력:");
		String str = sc.nextLine();
		double d2 = Double.parseDouble(str);
		str = sc.nextLine();
		double d3 = Double.parseDouble(str);
		str = sc.nextLine();
		double d4 = Double.parseDouble(str);
		System.out.println("상자의 부피는"+(d2*d3*d4)+"입니다");
		
		System.out.println("평을 입력하시오:");
		String s2 = sc.nextLine();
		double d5 = Double.parseDouble(s2);
		d5 = d5 * 3.3;
		System.out.println(d5+"평방미터입니다.");
		
		System.out.println("질량:");
		String s3 = sc.nextLine();
		double d6 = Double.parseDouble(s3);
		System.out.println("속도:");
		s3 = sc.nextLine();
		double d7 = Double.parseDouble(s3);
		System.out.println("운동에너지:"+(d6*d7*d7)/2.0);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String str1=sc.nextLine();
		System.out.println("당신의 나이는 몇살입니까?");
		String str2=sc.nextLine();
		System.out.println("당신의 키는 얼마 입니까?");
		String str3=sc.nextLine();
		System.out.println("당신의 몸무게는 얼마입니까?");
		String str4=sc.nextLine();
		System.out.println("당신의 이름은 "+str1+"이고, 나이는 "
		+str2+", 키는 "+str3+", 몸무게는 "+str4+" 입니다.");
		
		
		
		
		
		sc.close();

	}

}
