package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel1 {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("data.xls");
		Workbook book = Workbook.getWorkbook(file); // excel 파일 읽어오기
		Sheet sheet = book.getSheet(0);// sheet 읽어오기
		int rows = sheet.getRows();
		//제목을 제외하기 위해 1부터 시작
		for (int i = 1; i < rows; i++) {
			Cell cell = sheet.getCell(0, i); // 열 , 행
			String s = cell.getContents();// 문자열 형태의 값 읽어오기
			System.out.print(s);
			System.out.println(sheet.getCell(1,i).getContents());
		}

	}
}
