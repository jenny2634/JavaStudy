package Baekjun;

import java.util.Scanner;

public class Main_1463 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] d = new int[1000001]; //������ȹ�� 
		
		int n = s.nextInt();
		
		d[0] =0;
		d[1] = 0;
		//n�� 0�̰ų� 1�϶��� ������ 0��
		
		for(int i=2; i<d.length;i++) {//���������� n���� �ݺ�, 
			d[i] = d[i-1] + 1;
			if(i%3==0) d[i] = Math.min(d[i], d[i/3]+1);
			//3���� ������ �� 0 �ΰ�� 3�� ������ +1
			if(i%2==0) d[i] = Math.min(d[i], d[i/2]+1);
			//2�� ������ �� 0�� ��� 2�� ������ +1
		}
		System.out.println(d[n]);
	}
}
