package ch04;

import java.util.Scanner;

public class ����������2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// ���� 0 ���� 1 �� 2
		boolean b = true;

		while(b){
			int �� = s.nextInt();
			double ran = Math.random() * 3;// 0.0~2.999999

			int ���� = (int) ran;

			if ((�� + 1) % 3 == ����) {// ���� ��
				System.out.println("��");
			} else {
				if (�� == ����) {// ���
					System.out.println("���");
				} else {// �̱�
					System.out.println("�̱�");
					b = false;
				}
			}

		}
	}
}
