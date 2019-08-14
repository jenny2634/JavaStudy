package Baekjun;

import java.util.Scanner;

public class Main_1003 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int d[][] = new int[41][2];

		d[0][0] = 1;
		d[0][1] = 0;

		d[1][0] = 0;
		d[1][1] = 1;

		for (int i = 2; i < 41; i++) {
			for (int j = 0; j < 2; j++) {
				d[i][j] = d[i-1][j] + d[i-2][j]; 
			}
		}

		int t = s.nextInt();// test case
		for (int i = 0; i < t; i++) {// 테스트 케이스 수 만큼 정수값 n받기
			int n = s.nextInt();
			System.out.printf("%d %d\n",d[n][0], d[n][1]);
		}
	}
}
