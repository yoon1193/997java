package com.home.ex1;

public class javaClass {

	public static void main(String[] args) {
		//자바문법만
				//이후과정은 메인에서 사용할 수 있는 자바문법을 배우는 과정
				//상수
				//System.out.println(상수);  상수가 화면에 출력.
				//상수도 데이터이므로 자료형에 맞춰 사용
				//자료형마다 해당 상수가 있따.
				
				//boolean상수-true,false
				System.out.println(true);//boolean 상수를 쓴것.
				//System.out.println(true1); 에러
				System.out.println(false);
				//System.out.println(매개변수); 많은 기능중하나는 매개변수가 상수면 상수를 화면에 출력하고 줄을 바꿈
				
				//char 문자형 상수 유닛코드1개
				//문자상수는 보통 앞 뒤에 '' 사용 /안하면 에러
				//유닛코드로 출력하고 싶으면 \\u 다음에 코드를 넣으면 
				System.out.println('1');
				System.out.println('각');
				System.out.println('\u0041');
				System.out.println('\u0042');
				
				//byte short int 자료형은 int형 상수처리 
				//해당 자료형의 범위가 맞는 숫자를 넣으면 상수처리됨.
				//int형 상수의 경우 소수점(없는) 숫자를 범위에 맞게 기술하면됨.
				System.out.println(21232);
				System.out.println(032);//8진수
				System.out.println(0x32);//16진수
				
				//System.out.println(1000000000000); 에러 int형 상수가 아니므로.
				
				//long형 상수처리
				System.out.println(10000000000000l);
				System.out.println(10000000000000L);
				//소수점이 (없는) 숫자에 long 숫자범위를 벗어나지 않는 숫자끝에 소대문자 l,L을 붙이면됨.
				
				//float형 상수
				//소수점이 (있는) 수끝에 F,f 를 붙여서 표시한다.
				System.out.println(3.14f);
				System.out.println(3f);
				System.out.println(3.f);
				System.out.println(.14F);
				
				//double형 상수
				//소수점이 (있는) 수는 double상수, 수 끝에 D,d 넣으면 double상수
				System.out.println(3.14);
				System.out.println(3.);
				System.out.println(.14);
				System.out.println(3d);
				System.out.println(3.d);
				System.out.println(.14D);
				System.out.println(3.14E-4);//e,E=10^ 0.000314
				
				//string형 상수 문자열상수
				//문자열 상수는 ""로 묶어서 표현.
				System.out.println("heollowWorld");
				System.out.println("123");
				
				//1-숫자 '1'-문자  "1"-문자열
				
				
				//상수의 연산 +-*/%
				//숫자는 수적 연산이 됨
				//문자열은 + 만 가능
				//수+수==수
				//문자열+문자열==문자열
				//수+문자열==문자열
				System.out.println(5+3);
				System.out.println(5.1+3.2);
				System.out.println("안녕"+"하세요");
				System.out.println(5+"안녕");
				System.out.println(5+5+"안녕"+"하세요");
				System.out.println("안녕"+"하세요"+5+5);//안녕하세요55
				System.out.println("안녕"+"하세요"+(5+5));//안녕하세요10

	}

}
