package com.human.ex;

public class javaClass {

	public static void main(String[] args) {
		//�ڹٹ�����
		//���İ����� ���ο��� ����� �� �ִ� �ڹٹ����� ���� ����
		//���
		//System.out.println(���);  ����� ȭ�鿡 ���.
		//����� �������̹Ƿ� �ڷ����� ���� ���
		//�ڷ������� �ش� ����� �ֵ�.
		
		//boolean���-true,false
		System.out.println(true);//boolean ����� ����.
		//System.out.println(true1); ����
		System.out.println(false);
		//System.out.println(�Ű�����); ���� ������ϳ��� �Ű������� ����� ����� ȭ�鿡 ����ϰ� ���� �ٲ�
		
		//char ������ ��� �����ڵ�1��
		//���ڻ���� ���� �� �ڿ� '' ��� /���ϸ� ����
		//�����ڵ�� ����ϰ� ������ \\u ������ �ڵ带 ������ ��
		System.out.println('1');
		System.out.println('��');
		System.out.println('\u0041');
		System.out.println('\u0042');
		
		//byte short int �ڷ����� int�� ���ó�� 
		//�ش� �ڷ����� ������ �´� ���ڸ� ������ ���ó����.
		//int�� ����� ��� �Ҽ���(����) ���ڸ� ������ �°� ����ϸ��.
		System.out.println(21232);
		System.out.println(032);//8����
		System.out.println(0x32);//16����
		
		//System.out.println(1000000000000); ���� int�� ����� �ƴϹǷ�.
		
		//long�� ���ó��
		System.out.println(10000000000000l);
		System.out.println(10000000000000L);
		//�Ҽ����� (����) ���ڿ� long ���ڹ����� ����� �ʴ� ���ڳ��� �Ҵ빮�� l,L�� ���̸��.
		
		//float�� ���
		//�Ҽ����� (�ִ�) ������ F,f �� �ٿ��� ǥ���Ѵ�.
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14F);
		
		//double�� ���
		//�Ҽ����� (�ִ�) ���� double���, �� ���� D,d ������ double���
		System.out.println(3.14);
		System.out.println(3.);
		System.out.println(.14);
		System.out.println(3d);
		System.out.println(3.d);
		System.out.println(.14D);
		System.out.println(3.14E-4);//e,E=10^ 0.000314
		
		//string�� ��� ���ڿ����
		//���ڿ� ����� ""�� ��� ǥ��.
		System.out.println("heollowWorld");
		System.out.println("123");
		
		//1-���� '1'-����  "1"-���ڿ�
		
		
		//����� ���� +-*/%
		//���ڴ� ���� ������ ��
		//���ڿ��� + �� ����
		//��+��==��
		//���ڿ�+���ڿ�==���ڿ�
		//��+���ڿ�==���ڿ�
		System.out.println(5+3);
		System.out.println(5.1+3.2);
		System.out.println("�ȳ�"+"�ϼ���");
		System.out.println(5+"�ȳ�");
		System.out.println(5+5+"�ȳ�"+"�ϼ���");
		System.out.println("�ȳ�"+"�ϼ���"+5+5);//�ȳ��ϼ���55
		System.out.println("�ȳ�"+"�ϼ���"+(5+5));//�ȳ��ϼ���10
		
		
		

	}

}
