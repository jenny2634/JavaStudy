package ch07;

import java.util.Scanner;

public class Method1 {
	// ��������, �������  <= Ŭ���� ����
	static int age;
	int score;
	
	int input() {
		// ��������
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}
	
	static int age22;
	
	public static void main(String[] args) {
	
		
		Method1 m = new Method1();
		m.input();
		
		new Method1().input();
		
		
	}
	
}
