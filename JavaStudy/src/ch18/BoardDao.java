package ch18;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<BoardDto> getBoardList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		for (int i = 0; i < 3; i++) {
			BoardDto board = new BoardDto("제목-"+i, "내용-"+i);
//			board.setTitle("제목-" + i);
//			board.setContent("내용-" + i);
			list.add(board);
		}
		return list;
	}
	

}