package ch18;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	public List<MemberDto> getMemberList() {
		List<MemberDto> memberList = new ArrayList<MemberDto>();
		for (int i = 0; i < 5; i++) {
			MemberDto member = new MemberDto();
			member.setId("id-" + i);
			member.setPass("pass-" + i);
			memberList.add(member);
		}
		return memberList;
	}
}