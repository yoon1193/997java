package com.human.ex;

public class javaClass5 {

	public static void main(String[] args) {
		//����� �Է��� �޾� ó��
		//����ڰ� Ű����� �Է��� �����͸� ���α׷����� �޾Ƽ� ó���ϴ°�.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("���ڿ��� �Է����ּ���>>");
		
		String str1 = scanner.nextLine();//����� �Է��� �޾� ���ڿ��� �������ִ� �Լ�
		//scanner.nextLine(); ����� �Է��� ��ٸ�.
		System.out.println(str1+" ��/�� �Է��ϼ̽��ϴ�.");
		//System.out.println("���α׷� ����");
		//scanner.close();//�ݾ������.
		
		//����� �Է��� ��� ���ڿ��̴�.
		//����ڷκ��� ���ڸ� ������ ���ڿ��� ���ڷ� �����ϴ� �Լ��� ���.
		//�� ���� �Է¹޾Ƽ� ���ϴ� ���α׷�
		System.out.println("������ �Է��ض�>>");
		str1 = scanner.nextLine();
		System.out.println("������ �Է��ض�>>");
		str1 = scanner.nextLine();
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str1);
		System.out.println("��>>"+(i1+i2));
		//System.out.println("�Է��� ������:"+i1);
		
		
		
		
		System.out.println("���α׷� ����");
		scanner.close();
		
		
	
				
	}

}
