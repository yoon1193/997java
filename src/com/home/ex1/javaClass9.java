package com.home.ex1;

public class javaClass9 {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//1��
		System.out.println("�߱��� �¼�����:");
		String s1 = sc.nextLine();
		double d1 = Double.parseDouble(s1);
		System.out.println("�߱����� ��������:");
		s1 = sc.nextLine();
		double d2 = Double.parseDouble(s1);		
		System.out.println(String.format("������� %.1f%% �Դϴ�", (d2/d1)*100));
		
		
		//2��
		System.out.println("�ð��� �Է��ϼ���:");
		String s2 = sc.nextLine();
		double d3 = Double.parseDouble(s2);
		int hour = (int)d3;  // �ð�
		int min = (int)((((d3*100)%100)/100)*60);
		d3 = ((((d3*100)%100)/100)*60);
		int sec = (int)((((d3*100)%100)/100)*60);
		System.out.println(String.format("���� �ð��� %d�ð� %d�� %d�� �Դϴ�",hour,min,sec));
		
		
		//����1
		System.out.println("������(kg)�� Ű(cm) �Է�:");
		String s3 = sc.nextLine();
		double d4 = Double.parseDouble(s3);
		s3 = sc.nextLine();
		double d5 = Double.parseDouble(s3);
		d5 = d5/100;
		double B = d4/(d5*d5);
		if(B>=20.0 && B<25.0  )
			System.out.println("ǥ���Դϴ�.");
		else			
			System.out.println("������ �ʿ��մϴ�.");
			
			
		//����2
		System.out.println("�� ���� ���ǰ��� �Է��ϼ���:");
		String s4 = sc.nextLine();
		int i1 = Integer.parseInt(s4);
		s4 = sc.nextLine();
		int i2 = Integer.parseInt(s4);
		s4 = sc.nextLine();
		int i3 = Integer.parseInt(s4);
		int c = 10000 - (i1+i2+i3);
		System.out.println(String.format("�Ž������� %d �Դϴ�",c));
		System.out.println("��õ����:" + c/5000);
		System.out.println("õ����:" + (c%5000)/1000);
		System.out.println("�����¥�� ����:" + (c%5000%1000)/500);
		System.out.println("���¥�� ����:" + (c%5000%1000%500)/100);
		System.out.println("���ʿ�¥�� ����:" + (c%5000%1000%500%100)/50);
		System.out.println("�ʿ�¥�� ����:" + (c%5000%1000%500%100%50)/10);
		
		
		//����3
		System.out.println("�Ÿ��� �ӷ� �Է�:");
		String s5 = sc.nextLine();
		int i4 = Integer.parseInt(s5);
		s5 = sc.nextLine();
		int i5 = Integer.parseInt(s5);
		double t = (double)i4/(double)i5;
		int hour1 = (int)t;
		int min1 = (int)((((t*100)%100)/100)*60);
		t = ((((t*100)%100)/100)*60);
		double sec1 = ((((t*100)%100)/100)*60);
		System.out.println(String.format("�ҿ�ð��� %d�ð� %d�� %.3f ���Դϴ�",hour1,min1,sec1));
		
		
		sc.close();
		
	}

}
