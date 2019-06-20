package paging;

public class Pagination2 {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 1;
		// 페이지 이동을 위해 표현되는 페이지의 시작 번호
		int startPage = 0;

		// 페이지 이동을 위해 표현되는 페이지의 끝 번호
		int endPage = 0;

		startPage = nowPage / 10 * 10 + 1;
		if (nowPage % 10 == 0) {//10 20 30 40 
			startPage = startPage - 10;
		}

		endPage = startPage + 9;

		// TODO
		int totalNumber = 57;//DB에 저장되어 있는 데이터(게시물)수
		int realEndPage = totalNumber / 10;
		if (totalNumber % 10 != 0) { // 11 54 131 7
			realEndPage++;
		}

		if (endPage > realEndPage) {
			endPage = realEndPage;
		}

		for (int i = startPage; i <= endPage; i++) {
			if (i == nowPage) {
				System.out.print("[" + i + "] ");
			} else {
				System.out.print(i + " ");
			}
		}

	}
}
