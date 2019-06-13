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
			if(row<0){//���� ������ �Ǿ��� ��
				//���� ������ �Ǿ����� 15�� �밢�� �� ���
				if(col<0) {
					row = row + 2;
					col = col + 1;
				}else {//���� �����϶� 
					row = row + n;
				}
			}else {//���� �����϶� 
				//���� ������ �Ǿ�����
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