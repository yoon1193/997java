package com.home.ex1;

public class javaClass4 {

	public static void main(String[] args) {
		        //�ڵ� ����ȯ

				//����

				byte b1 = 10;//�ڷ����� �ٸ��� ������ ���� ������ ����.
				//short s1 = 10;//�ڵ� ����ȯ �Ǿ� ��.
				char c1 = 10;//������ �ڷ����� int�� ����� �ڵ����� ����ȯ �Ǿ� ��.
				int i1 = 10; //4byte
				long l1 = 10; //8byte
				
				//�ȵǴ� ���
				//int i2 = l1; 
				//���� �����͸� ū�����Ϳ� ������ �ڵ� ����ȯ ��.
				//�ݴ��� ��� �ڵ� ����ȯ �ȵ�.
				//b1=i1; ����
				//b1=s1; ����
				i1=i1+i1;//20

				//b1=b1+b1;//error int ũ�⺸�� ���� �ڷ��� ������ int�� �ڵ�����ȯ�ȴ�.

				           //byte+byte = int, short+short=int

				//i1=l1+10; error  //long+int=long
				l1=l1+i1;

				//c1='A'+1;//char+int=int => char('B')
				c1='A'+10;

				System.out.println(c1);

				

				//�Ǽ�
				float f1 = 10.F; //4byte
				double d1 = 10.; //8byte
				d1=f1;//���� float�� double��
				
				//f1=d1;//�Ұ���
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

				

				

				//���� ����ȯ(casting)
				//(�ڷ���) �Ұ�ȣ�ȿ� �����ϰ��� �ϴ� �ڷ����� �־��ش�.
				b1=(byte)(b1+b1);
				i1=(int)(l1);//ũ��ٸ��Ƿ� �ս� ��������� 
				f1=3.14f;
				i1=(int)f1;
				System.out.println(i1);//3
				f1=i1;
				System.out.println(f1);//3.0
				//f1=(float)d1;
				//System.out.println(f1);
				
				
				//���� �ڷ����� ���ڿ��� ��ȯ
				String str3=f1+"";
				System.out.println(str3);
				str3="10";
				i1=Integer.parseInt(str3);//i1�� ���� 10��
				System.out.println(i1);
				i1=Integer.valueOf(str3);//parseInt�� �����ǹ� ��κ��̰ž�.
				System.out.println(i1);
				str3="3.14";
				d1=Double.parseDouble(str3);//d1��3.14�� ��
				System.out.println(d1);
				str3="1.14hi";//�߸��� ���ڿ��� ����ϸ� �����߻�.

				
	}

}
