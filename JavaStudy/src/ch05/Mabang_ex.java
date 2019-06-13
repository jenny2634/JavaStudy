package ch05;

public class Mabang_ex {
	public static void main(String[] args) {
		int n=7;
		int[][] mabang = new int[n][n];

		int row = 0;
		int col = n/2;
		mabang[row][col] = 1;
		

		for (int i = 2; i <=n*n; i++) {
			row = row - 1;
			col = col - 1;
			if(row<0){//행이 음수가 되었을 때
				//열도 음수가 되었을때 15의 대각선 위 경우
				if(col<0) {
					row = row + 2;
					col = col + 1;
				}else {//열은 정상일때 
					row = row + n;
				}
			}else {//행이 정상일때 
				//열이 음수가 되었을때
				if(col<0) {
					col = col + n;
				}else {
					if(mabang[row][col] !=0) {
					row = row + 2;
					col = col + 1;
					}
				}
			}
			
			mabang[row][col] = i;
		}
		
		for(int i = 0 ; i<n ;i++) {
			for(int j= 0; j<n; j++) {
				System.out.print(mabang[i][j]+"\t");
			}
			System.out.println();
		}

	}
}