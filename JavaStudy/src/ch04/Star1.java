package ch04;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		print(3,"q");
		print(7,"#");
	}
	
	static void print(int count, String s) {
		
		for(int i=1;i<=count;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		
	}
}
