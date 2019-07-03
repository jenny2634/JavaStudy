package ch18;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<BoardDto> getBoardList() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		for (int i = 0; i < 3; i++) {
			BoardDto board = new BoardDto("力格-"+i, "郴侩-"+i);
//			board.setTitle("力格-" + i);
//			board.setContent("郴侩-" + i);
			list.add(board);
		}
		return list;
	}
	

}