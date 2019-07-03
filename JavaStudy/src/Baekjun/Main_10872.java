package Baekjun;

import java.util.Scanner;

public class Main_10872 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total = fact(n);
		System.out.println(total);

	}

	public static int fact(int n) {
		int total = 1;

		for (int i = 1; i <= n; i++) {
			total = total * i;

		}

		return total;

	}
}
