package Baekjun;

import java.util.Scanner;

public class Main_2042_re {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < m + k; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
		
			int sum = 0;
			if (a == 1) {
				arr[b-1] = c;
			} else if(a==2) {
				for (int j = b-1; j <= c-1; j++) {
					sum += arr[j];
				}
				System.out.println(sum);
			}
		}

	}
}
