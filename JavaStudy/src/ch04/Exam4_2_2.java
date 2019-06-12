package ch04;

public class Exam4_2_2 {
	public static void main(String[] args) {
		int year = 1997; // 연도
		
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("윤년입니다");
			}
			else if(year%100 == 0) {
				System.out.println("평년입니다");
			}
			else {
				System.out.println("윤년입니다");
			}
		}
		else {
			System.out.println("평년입니다");
		}
	}
}
