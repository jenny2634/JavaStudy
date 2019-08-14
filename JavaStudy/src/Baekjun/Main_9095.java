package Baekjun;

import java.util.Scanner;

public class Main_9095 {
	public static void main(String[] args) {

		int[] dp = new int[11];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 4; i < 11; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			System.out.println(dp[n]);
		}

	}

}
