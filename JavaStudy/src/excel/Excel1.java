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
		Workbook book = Workbook.getWorkbook(file); //excel 파일 읽어오기
		Sheet sheet = book.getSheet(0);//sheet 읽어오기
		Cell cell = sheet.getCell(1,3); //열 , 행
		String s = cell.getContents();//문자열 형태의 값 읽어오기
		System.out.println(s);
		
		
	}
}
