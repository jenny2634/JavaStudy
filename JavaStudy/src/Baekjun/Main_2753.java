package Baekjun;

import java.util.Scanner;

public class Main_2753 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n % 400 ==0) System.out.println(1);
		else if(n%100 ==0 ) System.out.println(0);
		else if(n%4 == 0) System.out.println(1);
		else System.out.println(0);
 	}
}
