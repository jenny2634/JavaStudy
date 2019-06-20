package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2.db접속
		String user ="root";
		String password  ="mysql";
		String url ="jdbc:mysql://localhost:3306/java";
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("접속완료");
		
		//3.sql문장 실행 준비
		String sql = "SELECT ID,PW,NAME FROM MEMBER";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
		
		
		//4.sql실행
		ResultSet rs = stmt.executeQuery();//db 값 (행) 반환
		rs.next();
		rs.next();
		String id = rs.getString("ID");
		String pw = rs.getString("PW");
		String name = rs.getString("NAME");
		System.out.printf("%s %s %s\n", id, pw, name);
		System.out.println("실행완료");
		
		
	}

}
