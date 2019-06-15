package homework;

import java.util.Scanner;

public class CutOperation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int[] stick = new int[n];
		for(int i= 0; i<n;i++) {
			stick[i] = s.nextInt();
		}
		int count = n;
	
		for(int i=0; i<n;i++) {
			int min = 99999;
			System.out.println(count);
			count = 0;
			for(int j =0; j<n; j++) {
				if(stick[j]< min && stick[j]!=0) min = stick[j];
			}
			for(int j=0; j<n;j++) {
				if(stick[j]!=0) {
					stick[j]-= min;
					if(stick[j]!=0) count++;
				}
			}
			if(count == 0) break;	
		}
	}
	

}
