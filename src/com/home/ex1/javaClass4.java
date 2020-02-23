package com.home.ex1;

public class javaClass4 {

	public static void main(String[] args) {
		        //자동 형변환

				//정수

				byte b1 = 10;//자료형이 다르면 변수에 값을 넣을수 없음.
				//short s1 = 10;//자동 형변환 되어 들어감.
				char c1 = 10;//정수형 자료형은 int형 상수가 자동으로 형변환 되어 들어감.
				int i1 = 10; //4byte
				long l1 = 10; //8byte
				
				//안되는 경우
				//int i2 = l1; 
				//작은 데이터를 큰데이터에 넣으면 자동 형변환 됨.
				//반대의 경우 자동 형변환 안됨.
				//b1=i1; 에러
				//b1=s1; 에러
				i1=i1+i1;//20

				//b1=b1+b1;//error int 크기보다 작은 자료형 연산은 int로 자동형변환된다.

				           //byte+byte = int, short+short=int

				//i1=l1+10; error  //long+int=long
				l1=l1+i1;

				//c1='A'+1;//char+int=int => char('B')
				c1='A'+10;

				System.out.println(c1);

				

				//실수
				float f1 = 10.F; //4byte
				double d1 = 10.; //8byte
				d1=f1;//가능 float을 double에
				
				//f1=d1;//불가능
				f1=i1; d1=i1; f1=l1; d1=l1;
				//i1=f1; i1=d1; //error

				String str1 = "hellow";
				//i1 = str1;  error
				//str1 = i1;  error
				str1=str1+10+10;//101010
				str1=10+10+str1;//2010
				//int+string=string
				//string+int=string
				//float+string=string

				

				

				//강제 형변환(casting)
				//(자료형) 소괄호안에 변경하고자 하는 자료형을 넣어준다.
				b1=(byte)(b1+b1);
				i1=(int)(l1);//크기다르므로 손실 생길수있음 
				f1=3.14f;
				i1=(int)f1;
				System.out.println(i1);//3
				f1=i1;
				System.out.println(f1);//3.0
				//f1=(float)d1;
				//System.out.println(f1);
				
				
				//숫자 자료형을 문자열로 변환
				String str3=f1+"";
				System.out.println(str3);
				str3="10";
				i1=Integer.parseInt(str3);//i1이 정수 10됨
				System.out.println(i1);
				i1=Integer.valueOf(str3);//parseInt와 같은의미 대부분이거씀.
				System.out.println(i1);
				str3="3.14";
				d1=Double.parseDouble(str3);//d1이3.14가 됨
				System.out.println(d1);
				str3="1.14hi";//잘못된 문자열을 사용하면 문제발생.

				
	}

}
