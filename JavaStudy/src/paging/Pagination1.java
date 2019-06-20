package paging;

public class Pagination1 {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 20;
		// 페이지 이동을 위해 표현되는 페이지의 시작 번호
		int startPage = 0;

		// 페이지 이동을 위해 표현되는 페이지의 끝 번호
		int endPage = 0;
		
		if(nowPage%10 == 0) startPage = ((nowPage/10)-1)*10 +1;
		else startPage = ((nowPage)/10)*10 +1;
		
		endPage = startPage +9;
		
		for(int i=startPage; i<=endPage;i++) {
			if(i == nowPage) {
				System.out.print("[" + i + "] ");
			}
			else System.out.print(i +" ");
		}
	}
}