package ch04;

public class Loop {
	public static void main(String[] args) {
		int n = 5;

		for(int i=0; i<5;i++) {
			for(int j=0;j<5-n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*n-1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			n--;
		}

	}

}
