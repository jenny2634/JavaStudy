package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		// 1.DB ���� url, username, password
		String url = "jdbc:mysql://192.168.0.62:3306/java";
		String username = "root";
		String password = "mysql";
		Connection con = DriverManager.getConnection(url, username, password);

		// 2.Query ���� �غ�
		// string '+=' �ص� �Ǵµ� �ٸ������, �ӵ� ������
		// stringbuffer'append' �������� ������(�������� ǥ��)
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT *");
		sql.append(" FROM EMP");
		PreparedStatement stmt = con.prepareStatement(sql.toString());

		// 3.Query ����
		ResultSet rs = stmt.executeQuery(); //����

		// 4.(��ȸ�϶���) ResultSet ���
		while(rs.next()){
			int empno = rs.getInt("EMPNO");
			String ename = rs.getString("ENAME");
			System.out.println(empno + "/" + ename);
		}

	}
}
