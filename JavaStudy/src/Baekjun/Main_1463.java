package Baekjun;

import java.util.Scanner;

public class Main_1463 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] d = new int[1000001]; //동적계획법 
		
		int n = s.nextInt();
		
		d[0] =0;
		d[1] = 0;
		//n이 0이거나 1일때는 무조건 0번
		
		for(int i=2; i<d.length;i++) {//최종숫자인 n까지 반복, 
			d[i] = d[i-1] + 1;
			if(i%3==0) d[i] = Math.min(d[i], d[i/3]+1);
			//3으로 나눴을 때 0 인경우 3로 나누고 +1
			if(i%2==0) d[i] = Math.min(d[i], d[i/2]+1);
			//2로 나눴을 때 0인 경우 2로 나누고 +1
		}
		System.out.println(d[n]);
	}
}
