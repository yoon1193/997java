package com.home.ex1;

public class javaClass8 {

	public static void main(String[] args) {
		//String.format() = ���ο� ���ڿ��� ����� �Լ�
		String str1 = String.format("�ȳ� ���̸��� %s","ȫ�浿");
		System.out.println(str1);

		

		//������ ���ڿ� ó��
		str1 = String.format("�ȳ� ���̸���%s�̰� ��°��� %s","ȫ�浿","����");
		System.out.println(str1);	
		str1 = String.format("�ȳ� ���̸��� %s�̰� ��°��� %s �ٴϴ�"+"�п��� %s�Դϴ�"
		                     ,"ȫ�浿","����","�޸�");
		System.out.println(str1);

		

		str1 = String.format("���̴� %d", 20);
		System.out.println(str1);
		str1 = String.format("�����Դ� %f", 68.4);
		System.out.println(str1);
		//%s�� ���ڿ� %d�� ���� %f�� �Ǽ�

		

		int i1 = 30;
		double d1 = 3.14163123;
		String str2 = "�ȳ�";

		//3�� ���
		str1 = String.format("%d %f %s",i1,d1,str2);
		System.out.println(str1);
		
		str1 = String.format(":%d:%-10d:%10d:",i1,i1,i1);//:30:30        :        30:
		System.out.println(str1);
		
		str1 = String.format("%f %.3f %.3f", d1,d1,d1-0.0005);//3.141631, 3.142, 3.141//0.0005�� �ݿø�����
		System.out.println(str1);
		
		str1 = String.format("%%\""); //%-%��� \"-\���
		System.out.println(str1);
		
		
		
		        
	}

}
