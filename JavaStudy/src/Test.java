import java.util.Scanner;

public class Test {
	// main �Է� �� Ctrl + Space
	// Shift + ctrl+ c �ּ�ó��(�ּ��� COMMENT)
	// ȭ�� ũ�� ctrl + n
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 0x100 0x100 [][][][][][]
		int[] a = new int[3];
		System.out.println(a.length);

		// �ڷ���
		// �̸� = �� <== �ʱ�ȭ
		int num = 123;
		System.out.println("hello");
		System.out.println("hello");
		System.out.println(num);

		// syso + ctrl + space ���
		/*
		 * System.out.println(1+5); System.out.println("�ȳ��ϼ���");
		 * System.out.println("AAA" + (1+5));
		 * 
		 * ���� : ���ϴ°� , ��� : �� �����Ǿ��ִ� �� String s = "�ȳ��ϼ���"; //string�� ���ڿ� int n =
		 * (1+5);//int�� ���� System.out.println(s + n); s = "�߰�����";
		 * System.out.println(s+n);
		 */

		// ����ȯ ��� ���
		// 1. �ƽ�Ű�ڵ� Ȱ�뤷�ϱ�
		// 2.�Ҽ��� ������
		/*
		 * int i=0; short s = 0; i=s;//���� s = (short)i;
		 * 
		 * double ���ڱݾ� = 1134.2348; int ������ü�� = 10000 + (int)���ڱݾ�;
		 * System.out.println(������ü��);
		 * 
		 * byte b =127;//-128~127 b++; System.out.println(b);
		 */

	}
}
