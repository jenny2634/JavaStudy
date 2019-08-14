package Baekjun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// 1~n
		int m = s.nextInt();// ±Ê¿Ã

		int row = 1;
		for (int i = 0; i < m; i++) {
			row = row * (n - i);
		}

		int[][] arr = new int[row][m];

		int count = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = count;
				count++;
				if (count > n)
					count = 1;
			}

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
