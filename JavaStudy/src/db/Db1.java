package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db1 {
	public static void main(String[] args) {
		
		try {
			//1.db접속 관련 라이브러리를 메모리에 등록
			Class.forName("com.mysql.jdbc.Driver");
			//2.db접속(url, id, pw)
			//         ??? root mysql
			String url = "jdbc:mysql://localhost:3306/java";
			String id = "root";
			String pw = "mysql";
			
			Connection con = DriverManager.getConnection(url);
			System.out.println("접속완료");
			
			//3.sql 준비
			String sql = "select * from emp";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			//4.실행
			ResultSet rs = stmt.executeQuery(); //또는 executeUpdate()
			while(rs.next()){
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				String hiredate = rs.getString("HIREDATE");
				System.out.printf("%d %s %s", empno, ename,hiredate);
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
