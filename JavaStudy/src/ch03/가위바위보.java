package ch03;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("����:0, ����:1, ��:2 �Է����ּ���");
		int �� = s1.nextInt();
		
		//���1
		double ran = Math.random() *3;//ran�� 0.0�̻� 1.0����
		//���2
		Random random = new Random();
		int ran2 = random.nextInt(3);//0~2���� ����
		
		int ���� = (int)ran;
		System.out.println("������ �� ����: "+ ����);

		if ((�� + 1) % 3 == ����) {// ���� ��
			System.out.println("��");
		} else {
			if (�� == ����) {// ���
				System.out.println("���");
			} else {// �̱�
				System.out.println("�̱�");
			}
		}
	}
}
