package ch06;

public class test2 {
	public static void main(String[] args) {

		getBetweenSum(3, 5);
		getBetweenSum(7, 7);
		getBetweenSum(5, 3);
		getBetweenSum(1, 10);

	}

	static void getBetweenSum(int a, int b) {
		int sum = 0;
		int temp = 0;
		if (b < a) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
