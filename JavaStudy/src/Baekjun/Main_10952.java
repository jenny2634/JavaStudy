package Baekjun;

import java.util.Scanner;

public class Main_10952 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count=0;
		int n1=0, n2=0;
		while(true) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			if(n1==0 && n2 ==0) break;
			System.out.println(n1+n2);
		}
			
	}
}
