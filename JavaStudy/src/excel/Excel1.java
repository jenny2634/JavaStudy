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
		Workbook book = Workbook.getWorkbook(file); // excel ���� �о����
		Sheet sheet = book.getSheet(0);// sheet �о����
		int rows = sheet.getRows();
		//������ �����ϱ� ���� 1���� ����
		for (int i = 1; i < rows; i++) {
			Cell cell = sheet.getCell(0, i); // �� , ��
			String s = cell.getContents();// ���ڿ� ������ �� �о����
			System.out.print(s);
			System.out.println(sheet.getCell(1,i).getContents());
		}

	}
}
