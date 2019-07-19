package Baekjun;

import java.util.Scanner;

public class Main_2869 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int v = s.nextInt();
		
		int count = (v-a)/(a-b);
		int count2 = (v-a)%(a-b);
		
		if(count2!=0) count++;
		count ++;
		System.out.println(count);

		
	}
}
