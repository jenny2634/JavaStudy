package ch18;

import java.util.List;

public class DaoLauncher {
	public static void main(String[] args) {
		
		//db접속 후 data 조회
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.getMemberList();

		for (int i = 0; i < list.size(); i++) {
			MemberDto dto = list.get(i);

			String id = dto.getId();
			String pass = dto.getPass();
			System.out.println(id + ", " + pass);
		}
	}
}