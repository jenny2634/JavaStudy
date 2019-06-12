package ch03;

public class Exam03_08 {
	public static void main(String[] args) {
		
		int num = -2;
		//양수, 음수만 판단 2가지로 판단
		System.out.println(num >= 0 ? "양수" : "음수");
		
		//양수, 음수, 0 3가지로 판단
		String result =(num>0) ? " 양수" :( (num<0)? "음수" : "0");
		System.out.println(result);
 	}
}
