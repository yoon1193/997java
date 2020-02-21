package com.human.ex;

public class javaClass5 {

	public static void main(String[] args) {
		//사용자 입력을 받아 처리
		//사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는것.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요>>");
		
		String str1 = scanner.nextLine();//사용자 입력을 받아 문자열로 리턴해주는 함수
		//scanner.nextLine(); 사용자 입력을 기다림.
		System.out.println(str1+" 을/를 입력하셨습니다.");
		//System.out.println("프로그램 종료");
		//scanner.close();//닫아줘야함.
		
		//사용자 입력은 모두 문자열이다.
		//사용자로부터 숫자를 받으려 문자열을 숫자로 변경하는 함수를 사용.
		//두 수를 입력받아서 더하는 프로그램
		System.out.println("정수를 입력해라>>");
		str1 = scanner.nextLine();
		System.out.println("정수를 입력해라>>");
		str1 = scanner.nextLine();
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str1);
		System.out.println("합>>"+(i1+i2));
		//System.out.println("입력한 정수는:"+i1);
		
		
		
		
		System.out.println("프로그램 종료");
		scanner.close();
		
		
	
				
	}

}
