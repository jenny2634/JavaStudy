package Baekjun;

import java.util.Scanner;

public class Test {//15596
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(sum(a));

	}

	static long sum(int[] a) {
		long total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;

	}

}
