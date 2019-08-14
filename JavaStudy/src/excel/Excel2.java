package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel2 {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("lotto.xls");
		Workbook book = Workbook.getWorkbook(file); // excel 파일 읽어오기
		Sheet sheet = book.getSheet(0);// sheet 읽어오기
		int rows = sheet.getRows();
		int count = 0;
		// 제목을 제외하기 위해 1부터 시작
		for (int i = 3; i < rows; i++) {

			String no = sheet.getCell(1, i).getContents();
			String s1 = sheet.getCell(13, i).getContents();
			int n1 = Integer.parseInt(s1);
			String s2 = sheet.getCell(14, i).getContents();
			int n2 = Integer.parseInt(s2);
			String s3 = sheet.getCell(15, i).getContents();
			int n3 = Integer.parseInt(s3);
			String s4 = sheet.getCell(16, i).getContents();
			String s5 = sheet.getCell(17, i).getContents();
			String s6 = sheet.getCell(18, i).getContents();
			System.out.printf("회차 : %s / %s %s %s %s %s %s \n", no, s1, s2, s3, s4, s5, s6);
			if (n1 + n2 == n3)
				count++;
		}

		System.out.println(count);
	}
}
