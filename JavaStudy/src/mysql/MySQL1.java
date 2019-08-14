package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		// 1.DB 접속 url, username, password
		String url = "jdbc:mysql://192.168.0.62:3306/java";
		String username = "root";
		String password = "mysql";
		Connection con = DriverManager.getConnection(url, username, password);

		// 2.Query 실행 준비
		// string '+=' 해도 되는데 줄맞춰야함, 속도 느리다
		// stringbuffer'append' 가독성이 좋아짐(여러라인 표현)
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM EMP");
		PreparedStatement stmt = con.prepareStatement(sql.toString());

		// 3.Query 실행
		ResultSet rs = stmt.executeQuery(); //공식

		// 4.(조회일때만) ResultSet 사용
		while(rs.next()){
			int empno = rs.getInt("EMPNO");
			String ename = rs.getString("ENAME");
			System.out.println(empno + "/" + ename);
		}

	}
}
