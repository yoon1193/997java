package com.home.ex1;

public class javaClass6 {

	public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

		

		System.out.println("Ű�� �Է��Ͻÿ�(cm):");
		String str = sc.nextLine();
		double d1 = Double.parseDouble(str);
		System.out.println("m�� ��ȯ�� �����"+(d1/100)+"�Դϴ�");

		

		System.out.println("������ ����,����,���̸� �ѹ��� �Է�:");
		String str1 = sc.nextLine();
		double d2 = Double.parseDouble(str1);
		str1 = sc.nextLine();
		double d3 = Double.parseDouble(str1);
		str1 = sc.nextLine();
		double d4 = Double.parseDouble(str1);
		System.out.println("������ ���Ǵ�"+(d2*d3*d4)+"�Դϴ�");

		

		System.out.println("���� �Է��Ͻÿ�:");
		String str2 = sc.nextLine();
		double d5 = Double.parseDouble(str2);
		d5 = d5 * 3.3;
		System.out.println(d5+"�������Դϴ�.");
		
		
		
		
		System.out.println("����:");
		String str3 = sc.nextLine();
		double d6 = Double.parseDouble(str3);
		System.out.println("�ӵ�:");
		str3 = sc.nextLine();
		double d7 = Double.parseDouble(str3);
		System.out.println("�������:"+(d6*d7*d7)/2.0);

		

		System.out.println("����� �̸��� �����Դϱ�?");
		String str4=sc.nextLine();
		System.out.println("����� ���̴� ����Դϱ�?");
		String str5=sc.nextLine();
		System.out.println("����� Ű�� �� �Դϱ�?");
		String str6=sc.nextLine();
		System.out.println("����� �����Դ� ���Դϱ�?");
		String str7=sc.nextLine();
		System.out.println("����� �̸��� "+str4+"�̰�, ���̴� "
		+str5+", Ű�� "+str6+", �����Դ� "+str7+" �Դϴ�.");
		

		sc.close();
		        
	}

}
