package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;
import com.mysql.jdbc.PreparedStatement;

public class Exam_Jdbc_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		 String[] title = {"�ǰ���", "������", "����", "����̴�"};
		 String[] content = {"Health", "is��, ��the", "first", "requisite",
		 "to", "success", "in", "life"};
		 
		 Calendar cal = Calendar.getInstance();
			String date = "";// ��¥ ���� ���� ���� YYYY-MM-DD 2019-06-13
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DATE);
			
			date = year + "-" + 
					(month < 10 ? "0" + month : month) + "-"+
					(day < 10 ? "0" + day : day);
			

		 
		// 1. ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB ����
			String user = "root";
			String password = "mysql";
			String url = "jdbc:mysql://localhost:3306/java";

			Connection con = DriverManager.getConnection(url, user, password);
			
			
		 
		 for(int i = 1; i <= 100; i++) {
			 String t = getInputData(title);
			 String c = getInputData(content);
			 
			 String sql = "INSERT INTO EX_BOARD(BRD_NO, BRD_TIT, BRD_CON, BRD_DATE)";
				sql = sql + "VALUES(?,?,?,?)";
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				//?��ġ�� ������ �°� �� �Է�
				stmt.setInt(1, i);
				stmt.setString(2, t);
				stmt.setString(3, c);
				stmt.setString(4, date);

				//4.sql����
				stmt.executeUpdate();
		 // getInputData() �޼ҵ带 �̿��Ͽ� �迭�� ����
		 // EX_BOARD ���̺� BRD_NO, BRD_TIT, BRD_CON, BRD_DATE ������ ����
		 }
		 }
		
			private static String getInputData(String[] data) {
				int ran = (int) Math.random() * data.length;
				return data[ran];
	}
}