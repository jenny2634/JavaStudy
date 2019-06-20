package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB ����
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("���� �Ϸ�!");

		// 3. SQL ���� ���� �غ�
		String sql = "";
		sql += "SELECT *";
		sql += "  FROM EMP";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);

		// 4. SQL ����
		ResultSet rs = stmt.executeQuery(); // DB ��(��) ��ȯ

		// for (int i = 0; i < 14; i++) {
		// rs.next(); // 1��° �� ������

		while (rs.next()) {// �ݺ� Ƚ���� �𸦶�
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String mgr = rs.getString("mgr");
			String hiredate = rs.getString("hiredate");
			String sal = rs.getString("sal");
			String comm = rs.getString("comm");
			String deptno = rs.getString("deptno");

			System.out.printf("%s %s %s %s %s %s %s %s\n", empno, ename, job, mgr, hiredate, sal, comm, deptno);

		}

		System.out.println("���� �Ϸ�");

	}

}
