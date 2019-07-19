package Baekjun;

import java.util.Scanner;

public class Main_1712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();
		long c = s.nextInt();
		long income = a + b;
		int count = 1;

		while (true) {

			if (b >= c) {
				System.out.println(-1);
				break;
			} else if (income >= count * c) {
				income += b;
				count++;
			} else if (income < (count * c)) {
				System.out.println(count);
				break;
			}

		}
	}

}
