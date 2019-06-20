package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Jdbc4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB 접속
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/java";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("접속 완료!");

		// 3. SQL 문장 실행 준비
		String sql = "";
		sql += "SELECT *";
		sql += "  FROM EMP";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);

		// 4. SQL 실행
		ResultSet rs = stmt.executeQuery(); // DB 값(행) 반환

		// for (int i = 0; i < 14; i++) {
		// rs.next(); // 1번째 행 데이터

		while (rs.next()) {// 반복 횟수를 모를때
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

		System.out.println("실행 완료");

	}

}
