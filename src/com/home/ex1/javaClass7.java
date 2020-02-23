package com.home.ex1;

public class javaClass7 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//두 수 입력받아 더한값 출력

		System.out.println("첫번째 수를 입력하시오");
		String str = sc.nextLine();
		int i1 = Integer.parseInt(str);
		//사용자가 입력한 숫자가 인트형 변수 i1에 들어가있다.
		
		System.out.println("두번째 수를 입력하시오");
		str = sc.nextLine();
		int i2 = Integer.parseInt(str);
		
		
		System.out.println("두 수의 합은"+(i1+i2)+"입니다");
		
		sc.close();
		
		        
	}

}
