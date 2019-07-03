package Baekjun;

import java.util.Scanner;

public class Main_3052 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		int arr[] = new int[10];
		int arr2[] = new int[42];
		
		for(int i =0; i<10 ; i++) {
			n =s.nextInt();
			arr[i] = n%42;
			int num = arr[i];
			arr2[num]++;
		
		}
		int count =0;
		for(int i =0 ; i<42; i++) {
			if(arr2[i]!=0) count ++;
		}
		
		System.out.println(count);
		
	}

}
