package ch06;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
		System.out.println("���� �Է����ּ���");
		int num = input();
		if(num>5) {
			
		}
		for(int i=0; i<5; i++) {
			
		}
		
		System.out.println("�Էµ� ����?" + num);
	
	}

	static int input() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}
}
