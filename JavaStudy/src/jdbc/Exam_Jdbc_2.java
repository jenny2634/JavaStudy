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
	
		 String[] title = {"건강은", "성공의", "제일", "요건이다"};
		 String[] content = {"Health", "is”, “the", "first", "requisite",
		 "to", "success", "in", "life"};
		 
		 Calendar cal = Calendar.getInstance();
			String date = "";// 날짜 정보 저장 변수 YYYY-MM-DD 2019-06-13
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DATE);
			
			date = year + "-" + 
					(month < 10 ? "0" + month : month) + "-"+
					(day < 10 ? "0" + day : day);
			

		 
		// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB 접속
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
				//?위치와 종류에 맞게 값 입력
				stmt.setInt(1, i);
				stmt.setString(2, t);
				stmt.setString(3, c);
				stmt.setString(4, date);

				//4.sql실행
				stmt.executeUpdate();
		 // getInputData() 메소드를 이용하여 배열값 추출
		 // EX_BOARD 테이블에 BRD_NO, BRD_TIT, BRD_CON, BRD_DATE 데이터 삽입
		 }
		 }
		
			private static String getInputData(String[] data) {
				int ran = (int) Math.random() * data.length;
				return data[ran];
	}
}