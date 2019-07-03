package Baekjun;

import java.util.Scanner;

public class Main_11021 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n1 = 0, n2 = 0;
		for (int i = 1; i <= t; i++) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println("Case #" + i + ": " + (n1 + n2));
		}
	}
}
