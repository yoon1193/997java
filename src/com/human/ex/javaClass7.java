package com.human.ex;

public class javaClass7 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//�� �� �Է¹޾� ���Ѱ� ���

		System.out.println("ù��° ���� �Է��Ͻÿ�");
		String str = sc.nextLine();
		int i1 = Integer.parseInt(str);
		//����ڰ� �Է��� ���ڰ� ��Ʈ�� ���� i1�� ���ִ�.
		
		System.out.println("�ι��� ���� �Է��Ͻÿ�");
		str = sc.nextLine();
		int i2 = Integer.parseInt(str);
		
		
		System.out.println("�� ���� ����"+(i1+i2)+"�Դϴ�");
		
		sc.close();
		

	}

}
