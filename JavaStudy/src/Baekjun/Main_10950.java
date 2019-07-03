package Baekjun;

import java.util.Scanner;

public class Main_10950 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1=0, n2=0;
		for (int i = 0; i < n; i++) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println(n1+n2);
		}
	}
}
