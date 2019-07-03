package Baekjun;

import java.util.Scanner;

public class Main_1011 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long n1 = 0, n2 = 0;
		long dis = 0;
		for (int i = 0; i < t; i++) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			dis = n2 - n1;
			if (dis == 1) {
				System.out.println(1);
			} else if (dis == 2) {
				System.out.println(2);

			} else {
				for (int j = 2;; j++) {

					if (dis > Math.pow(j, 2) - j  && dis <= Math.pow(j, 2) + j) {
						if (dis <= Math.pow(j, 2)) {// È¦¼ö
							System.out.println(j * 2 - 1);
							break;
						} else {// Â¦¼ö
							System.out.println(j * 2);
							break;
						}
					}

				}

			}

		}
	}

}
