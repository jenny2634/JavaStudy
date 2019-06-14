package ch07;

import java.util.Scanner;

public class Method1 {
	// 전역변수, 멤버변수  <= 클래스 영역
	static int age;
	int score;
	
	int input() {
		// 지역변수
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
