package homework;

public class Star2 {
	public static void main(String[] args) {
		int n = 11;
		int center = n/2+1;
		int leftspace = center;
		int rightspace = center;
		
		for(int i =1;i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(j==leftspace || j==rightspace) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			if(i<center) {
				leftspace --;
				rightspace ++;
			}
			else {
				leftspace ++;
				rightspace --;
			}
			System.out.println("");
		}
		
	}

}
