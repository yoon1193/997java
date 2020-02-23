package com.home.ex1;

public class javaClass2 {

	public static void main(String[] args) {
		
		        //byte short 
				byte b1;
				//할당되지 않은 변수를 사용할수 없다
				//System.out.println(b1);
				b1 = 10;
				System.out.println(b1);
				
				short s1 = 11;
				System.out.println(s1);
				
				int i1 = 10;
				System.out.println(i1);
				
				i1 = 3*20+10;//연산식이 실행된 다음에 i1에 저장.
				System.out.println(i1);
				i1 =10+3*20;//우선순위가 고려돼서 실행된다
				System.out.println(i1);
				
				i1 = 10;
				i1 = 10+i1;//i1+=10;
				System.out.println(i1);
				
				int i2 = 10;
				int i3 = i1+i2;
				System.out.println(i3);//System.out.println(i1+i2);
				 
				long c = 10000000000L;
				System.out.println(c);
				
				float a = 1.4F;
				System.out.println(a);
				 
				double b = 3.14;
				System.out.println(b);
				
				String str = "hellow\tWorld";
				System.out.println(str);
				
				System.out.println(Math.sqrt(9));//sqrt 루트.
				System.out.println(Math.sqrt(16));
				
				
				int d = 10;
				int e = 3;
				System.out.println(d/e);
				System.out.println(d%e);
	}

}
