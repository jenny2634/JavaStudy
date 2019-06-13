package ch06;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
		System.out.println("값을 입력해주세요");
		int num = input();
		if(num>5) {
			
		}
		for(int i=0; i<5; i++) {
			
		}
		
		System.out.println("입력된 값은?" + num);
	
	}

	static int input() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}
}
