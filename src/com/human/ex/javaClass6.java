package com.human.ex;

public class javaClass6 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ�(cm):");
		String s1 = sc.nextLine();
		double d1 = Double.parseDouble(s1);
		
		System.out.println("m�� ��ȯ�� �����"+(d1/100)+"�Դϴ�");
		
		System.out.println("������ ����,����,���̸� �ѹ��� �Է�:");
		String str = sc.nextLine();
		double d2 = Double.parseDouble(str);
		str = sc.nextLine();
		double d3 = Double.parseDouble(str);
		str = sc.nextLine();
		double d4 = Double.parseDouble(str);
		System.out.println("������ ���Ǵ�"+(d2*d3*d4)+"�Դϴ�");
		
		System.out.println("���� �Է��Ͻÿ�:");
		String s2 = sc.nextLine();
		double d5 = Double.parseDouble(s2);
		d5 = d5 * 3.3;
		System.out.println(d5+"�������Դϴ�.");
		
		System.out.println("����:");
		String s3 = sc.nextLine();
		double d6 = Double.parseDouble(s3);
		System.out.println("�ӵ�:");
		s3 = sc.nextLine();
		double d7 = Double.parseDouble(s3);
		System.out.println("�������:"+(d6*d7*d7)/2.0);
		
		System.out.println("����� �̸��� �����Դϱ�?");
		String str1=sc.nextLine();
		System.out.println("����� ���̴� ����Դϱ�?");
		String str2=sc.nextLine();
		System.out.println("����� Ű�� �� �Դϱ�?");
		String str3=sc.nextLine();
		System.out.println("����� �����Դ� ���Դϱ�?");
		String str4=sc.nextLine();
		System.out.println("����� �̸��� "+str1+"�̰�, ���̴� "
		+str2+", Ű�� "+str3+", �����Դ� "+str4+" �Դϴ�.");
		
		
		
		
		
		sc.close();

	}

}
