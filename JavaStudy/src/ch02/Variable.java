package ch02;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		//���̺귯�� library
		// ctrl+f11 : Ŭ���� ����
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		
		int n = s.nextInt();//Ű���� �Է� ���� ��������
		System.out.println("�Էµ� ����" + n);
		System.out.println((char)n);
	
		String text = s.next();//����
		System.out.println("�Էµ� ����" + text);
		

	}

}
