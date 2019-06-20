package Baekjun;

import java.util.Scanner;

public class Main_2941 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();
		char[] letter = str.toCharArray();

		int count = str.length();

		for (int i = 0; i < str.length(); i++) {
			if (letter[i] == '-') {
				count--;
			} else if (letter[i] == '=') {
				if (i >= 2) {
					if (letter[i - 2] == 'd' && letter[i - 1] == 'z') {
						count = count - 2;
					} else
						count--;
				} else
					count--;
			} else if (letter[i] == 'j') {
				if (letter[i - 1] == 'l' || letter[i - 1] == 'n')
					count--;
			}

		}
		System.out.println(count);

	}
}
