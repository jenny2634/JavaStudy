package ch04;

//소스코드 정렬 shift ctrl f
public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345678;
		int num2 = 12345678;
		int total = 0;
		int total2 =0;
		
		for(; num >0 ; num= num/10) {
			total = total + (num % 10);
		}
		
		System.out.println(total);
		
		while( num2>0) {
			total2 = total2 +(num2%10);
			num2 = num2/10;
		}
		System.out.println(total2);
		
	}

}
