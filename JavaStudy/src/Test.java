import java.util.Scanner;

public class Test {
	// main 입력 후 Ctrl + Space
	// Shift + ctrl+ c 주석처리(주석은 COMMENT)
	// 화면 크게 ctrl + n
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 0x100 0x100 [][][][][][]
		int[] a = new int[3];
		System.out.println(a.length);

		// 자료형
		// 이름 = 값 <== 초기화
		int num = 123;
		System.out.println("hello");
		System.out.println("hello");
		System.out.println(num);

		// syso + ctrl + space 출력
		/*
		 * System.out.println(1+5); System.out.println("안녕하세요");
		 * System.out.println("AAA" + (1+5));
		 * 
		 * 변수 : 변하는값 , 상수 : 늘 고정되어있는 값 String s = "안녕하세요"; //string은 문자열 int n =
		 * (1+5);//int는 정수 System.out.println(s + n); s = "잘가세요";
		 * System.out.println(s+n);
		 */

		// 형변환 사용 경우
		// 1. 아스키코드 활용ㅇ하기
		// 2.소수점 버리기
		/*
		 * int i=0; short s = 0; i=s;//가능 s = (short)i;
		 * 
		 * double 이자금액 = 1134.2348; int 통장이체액 = 10000 + (int)이자금액;
		 * System.out.println(통장이체액);
		 * 
		 * byte b =127;//-128~127 b++; System.out.println(b);
		 */

	}
}
