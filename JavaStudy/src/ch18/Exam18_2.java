package ch18;

import java.util.List;

public class Exam18_2 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.getBoardList();
		// 출력 코드 작성
		for(int i =0; i<3; i++) {
			BoardDto  dto = list.get(i);
			
			/*String title = dto.getTitle();
			String content = dto.getContent();
			System.out.println(title + "/" + content);*/
			
			System.out.println(list.get(i).getTitle());
			System.out.println(list.get(i).getContent());
			
			
			
		}
	}
}