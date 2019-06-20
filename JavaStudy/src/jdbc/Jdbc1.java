package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc1 {
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
		String sql = "INSERT INTO MEMBER(ID,PW,NAME)";
		sql = sql + "VALUES(?,?,?)";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
		//?위치와 종류에 맞게 값 입력
		stmt.setString(1, "abc");
		stmt.setString(2, "123");
		stmt.setString(3, "홍길동");
		

		//4.sql실행
		stmt.executeUpdate();
		System.out.println("실행완료");
		
	}

}
