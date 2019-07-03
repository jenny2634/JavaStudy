package Baekjun;

import java.util.Scanner;

public class Main_2588 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int n2_1 = n2 % 10;
		int n2_2 = n2 / 10 % 10;
		int n2_3 = n2 / 100 % 10;

		int mul_1 = n1 * n2_1;
		int mul_2 = n1 * n2_2;
		int mul_3 = n1 * n2_3;
		int mul = mul_1 + mul_2 *10 + mul_3 *100;

		System.out.println(mul_1);
		System.out.println(mul_2);
		System.out.println(mul_3);
		System.out.println(mul);

	}
}
