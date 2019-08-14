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
		Workbook book = Workbook.getWorkbook(file); //excel ���� �о����
		Sheet sheet = book.getSheet(0);//sheet �о����
		Cell cell = sheet.getCell(1,3); //�� , ��
		String s = cell.getContents();//���ڿ� ������ �� �о����
		System.out.println(s);
		
		
	}
}
