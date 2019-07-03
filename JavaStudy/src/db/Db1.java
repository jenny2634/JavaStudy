package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db1 {
	public static void main(String[] args) {
		
		try {
			//1.db���� ���� ���̺귯���� �޸𸮿� ���
			Class.forName("com.mysql.jdbc.Driver");
			//2.db����(url, id, pw)
			//         ??? root mysql
			String url = "jdbc:mysql://localhost:3306/java";
			String id = "root";
			String pw = "mysql";
			
			Connection con = DriverManager.getConnection(url);
			System.out.println("���ӿϷ�");
			
			//3.sql �غ�
			String sql = "select * from emp";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			//4.����
			ResultSet rs = stmt.executeQuery(); //�Ǵ� executeUpdate()
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
