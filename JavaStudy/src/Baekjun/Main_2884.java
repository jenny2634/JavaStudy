package Baekjun;

import java.util.Scanner;

public class Main_2884 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		n2 = n2 - 45;
		if (n2 < 0) {
			n1 = n1 - 1;
			if (n1 < 0)
				n1 = 24 + n1;
			n2 = 60 + n2;
		}

		System.out.println(n1 + " " + n2);
	}
}
