package Baekjun;

import java.util.Scanner;

public class Main_1330 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		if(n1<n2) System.out.println("<");
		else if(n1>n2) System.out.println(">");
		else System.out.println("==");
	}
}
