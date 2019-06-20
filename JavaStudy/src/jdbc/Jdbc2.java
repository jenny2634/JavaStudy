package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2.db����
		String user ="root";
		String password  ="mysql";
		String url ="jdbc:mysql://localhost:3306/java";
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("���ӿϷ�");
		
		//3.sql���� ���� �غ�
		String sql = "SELECT ID,PW,NAME FROM MEMBER";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
		
		
		//4.sql����
		ResultSet rs = stmt.executeQuery();//db �� (��) ��ȯ
		rs.next();
		rs.next();
		String id = rs.getString("ID");
		String pw = rs.getString("PW");
		String name = rs.getString("NAME");
		System.out.printf("%s %s %s\n", id, pw, name);
		System.out.println("����Ϸ�");
		
		
	}

}
