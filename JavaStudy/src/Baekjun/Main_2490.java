package Baekjun;

import java.util.Scanner;

public class Main_2490 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[3][4];
		
		for(int i=0; i<3 ;i++) {
			for(int j=0; j<4;j++) {
				arr[i][j]= s.nextInt();
			}
			int count0=0, count1=0;
			for(int j=0; j<4; j++) {
				if(arr[i][j]==0) count0++;
				else count1++;
			}
			if(count0 == 1 && count1==3) System.out.println("A");
			else if(count0 == 2 && count1==2) System.out.println("B");
			else if(count0 == 3 && count1==1) System.out.println("C");
			else if(count0 == 4 && count1==0) System.out.println("D");
			else if(count0 == 0 && count1==4) System.out.println("E");
		}
		
	}

}
