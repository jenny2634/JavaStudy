package mysql;

import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO {
	public List<Map<String,String>> select() throws ClassNotFoundException, SQLException {
		// Data Access Object => DAO => XXXDAO
		// DAO�� �ϳ��� ���̺� �����ؼ� �۾�
		// Table�� - Member => MemberDAO
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
		ResultSet rs = stmt.executeQuery(); // ����
		
		List<Map<String, String>> list = new ArrayList<>();

		// 4.(��ȸ�϶���) ResultSet ���
		while (rs.next()) {
			int empno = rs.getInt("EMPNO");
			String ename = rs.getString("ENAME");
			Map<String, String> map = new HashMap<>();
			map.put("empno", empno + "");
			map.put("ename", ename);
			
			list.add(map);
		}
		return list;
	}

}
