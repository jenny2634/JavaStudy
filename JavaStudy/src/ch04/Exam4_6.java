package ch04;

public class Exam4_6 {
	public static void main(String[] args) {
		int space = 4;
		
		for(int i= 1;i<=5;i++ ) {
			for(int j=1; j<=5;j++) {
				if(j<=space) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			space --;
			
		}
		
	}

}
