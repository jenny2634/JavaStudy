package Baekjun;

import java.util.Scanner;

public class Main_10818 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int min=99999999;
		int max= -99999999;
		int n =0;
		for(int i=0; i< t ; i++) {
			n = s.nextInt();
			if(n<=min) min = n;
			if(n>=max) max = n;
		}
		System.out.println(min + " " + max);
	}
}
