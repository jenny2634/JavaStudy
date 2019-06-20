package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc1 {
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
		String sql = "INSERT INTO MEMBER(ID,PW,NAME)";
		sql = sql + "VALUES(?,?,?)";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
		//?��ġ�� ������ �°� �� �Է�
		stmt.setString(1, "abc");
		stmt.setString(2, "123");
		stmt.setString(3, "ȫ�浿");
		

		//4.sql����
		stmt.executeUpdate();
		System.out.println("����Ϸ�");
		
	}

}
