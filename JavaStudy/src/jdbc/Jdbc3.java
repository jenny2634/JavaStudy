package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이버 로딩
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2. DB 접속
				String user = "root";
				String password = "mysql";
				String url = "jdbc:mysql://localhost:3306/java";
				
				Connection con = 
					DriverManager.getConnection(url, user, password);
				System.out.println("접속 완료!");
				
				// 3. SQL 문장 실행 준비
				String sql = "";
				sql += "SELECT COMPANY, COUNT(*)";
				sql += "  FROM NOODLE";
				sql += " GROUP BY COMPANY";
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
				// 4. SQL 실행
				ResultSet rs = stmt.executeQuery(); // DB 값(행) 반환
				
				rs.next(); // 1번째 행 데이터
				String company = rs.getString("COMPANY");
				String count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);

				rs.next(); // 2번째 행 데이터
				company = rs.getString("COMPANY");
				count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);
				
				rs.next(); // 3번째 행 데이터
				company = rs.getString("COMPANY");
				count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);
				
				System.out.println("실행 완료");
		
	}

}
