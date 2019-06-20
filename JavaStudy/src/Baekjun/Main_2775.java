package Baekjun;

import java.util.Scanner;

public class Main_2775 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int k = 0, n = 0;
		
		int apt[][] = new int[15][15];
		for(int i =0; i<=14; i++) {                             
			for(int j = 1;j<15;j++) {
				if(j==1) apt[i][j] = 1;
				else if(i==0) apt[i][j] = j;
				else {
					apt[i][j] = apt[i][j-1] + apt[i-1][j];
				}
				
			}
		}
		
		int test = s.nextInt();
		for (int i = 0; i < test; i++) {
			k = s.nextInt();//Ãþ¼ö
			n = s.nextInt();//È£¼ö
			
			System.out.println(apt[k][n]);
			
		}
	}
}
