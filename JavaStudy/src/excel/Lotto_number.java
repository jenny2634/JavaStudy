package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Lotto_number {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("lotto.xls");
		Workbook book = Workbook.getWorkbook(file); // excel ���� �о����
		Sheet sheet = book.getSheet(0);// sheet �о����
		int rows = sheet.getRows();
		
		int[][] arr = new int[2][46];
		for (int i = 1; i <= 45; i++) {
			arr[0][i] = i;
		}
		// ������ �����ϱ� ���� 1���� ����
		for (int i = 3; i < rows; i++) {

			for (int j = 13; j <= 18; j++) {
				String s = sheet.getCell(j, i).getContents();
				int n = Integer.parseInt(s);
				
				for (int k = 1; k <= 45; k++) {
					if (arr[0][k] == n) arr[1][k] += 1;
				}
			}
		}
		
		for(int i=1;i<=45;i++) {
			
			System.out.print(arr[0][i]+ " " + arr[1][i]);
			System.out.print("\n");
			
		}
		

		
	}
}
