package ch18;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<BoardDto> getBoardList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		for (int i = 0; i < 3; i++) {
			BoardDto board = new BoardDto("����-"+i, "����-"+i);
//			board.setTitle("����-" + i);
//			board.setContent("����-" + i);
			list.add(board);
		}
		return list;
	}
	

}