package paging;

public class Pagination2 {
	public static void main(String[] args) {
		// ���� �������� ��ȣ
		int nowPage = 1;
		// ������ �̵��� ���� ǥ���Ǵ� �������� ���� ��ȣ
		int startPage = 0;

		// ������ �̵��� ���� ǥ���Ǵ� �������� �� ��ȣ
		int endPage = 0;

		startPage = nowPage / 10 * 10 + 1;
		if (nowPage % 10 == 0) {//10 20 30 40 
			startPage = startPage - 10;
		}

		endPage = startPage + 9;

		// TODO
		int totalNumber = 57;//DB�� ����Ǿ� �ִ� ������(�Խù�)��
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
