package Baekjun;

import java.util.Scanner;

public class Main_2562 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[9];
		int max = -99999;
		int maxi = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = s.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				maxi = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxi);
	}
}
