package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. ����̹� �ε�
				Class.forName("com.mysql.jdbc.Driver");
				
				// 2. DB ����
				String user = "root";
				String password = "mysql";
				String url = "jdbc:mysql://localhost:3306/java";
				
				Connection con = 
					DriverManager.getConnection(url, user, password);
				System.out.println("���� �Ϸ�!");
				
				// 3. SQL ���� ���� �غ�
				String sql = "";
				sql += "SELECT COMPANY, COUNT(*)";
				sql += "  FROM NOODLE";
				sql += " GROUP BY COMPANY";
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
				// 4. SQL ����
				ResultSet rs = stmt.executeQuery(); // DB ��(��) ��ȯ
				
				rs.next(); // 1��° �� ������
				String company = rs.getString("COMPANY");
				String count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);

				rs.next(); // 2��° �� ������
				company = rs.getString("COMPANY");
				count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);
				
				rs.next(); // 3��° �� ������
				company = rs.getString("COMPANY");
				count = rs.getString("COUNT(*)");
				System.out.printf("%s %s", company, count);
				
				System.out.println("���� �Ϸ�");
		
	}

}
