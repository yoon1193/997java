package com.home.ex1;

public class javaClass8 {

	public static void main(String[] args) {
		//String.format() = 새로운 문자열을 만드는 함수
		String str1 = String.format("안녕 내이름은 %s","홍길동");
		System.out.println(str1);

		

		//여러개 문자열 처리
		str1 = String.format("안녕 내이름은%s이고 사는곳은 %s","홍길동","대전");
		System.out.println(str1);	
		str1 = String.format("안녕 내이름은 %s이고 사는곳은 %s 다니는"+"학원은 %s입니다"
		                     ,"홍길동","대전","휴먼");
		System.out.println(str1);

		

		str1 = String.format("나이는 %d", 20);
		System.out.println(str1);
		str1 = String.format("몸무게는 %f", 68.4);
		System.out.println(str1);
		//%s는 문자열 %d는 정수 %f는 실수

		

		int i1 = 30;
		double d1 = 3.14163123;
		String str2 = "안녕";

		//3개 출력
		str1 = String.format("%d %f %s",i1,d1,str2);
		System.out.println(str1);
		
		str1 = String.format(":%d:%-10d:%10d:",i1,i1,i1);//:30:30        :        30:
		System.out.println(str1);
		
		str1 = String.format("%f %.3f %.3f", d1,d1,d1-0.0005);//3.141631, 3.142, 3.141//0.0005는 반올림제거
		System.out.println(str1);
		
		str1 = String.format("%%\""); //%-%출력 \"-\출력
		System.out.println(str1);
		
		
		
		        
	}

}
