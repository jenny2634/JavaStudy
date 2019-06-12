package ch02;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		//라이브러리 library
		// ctrl+f11 : 클래스 실행
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int n = s.nextInt();//키보드 입력 숫자 가져오기
		System.out.println("입력된 값은" + n);
		System.out.println((char)n);
	
		String text = s.next();//문자
		System.out.println("입력된 값은" + text);
		

	}

}
