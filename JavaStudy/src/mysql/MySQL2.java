package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class MySQL2 {
	public static void main(String[] args) {
		EmpDAO eDAO = new EmpDAO();
		List<Map<String, String>> list;
		try {
			list = eDAO.select();
			for(int i= 0; i<list.size(); i++) {
				//현재 key 2개 존재(empno, ename)
				Map<String , String> map = list.get(i);
				String empno = map.get("empno");
				String ename = map.get("ename");
				System.out.println(empno + ename);
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
