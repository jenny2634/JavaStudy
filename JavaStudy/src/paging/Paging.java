package paging;

public class Paging {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 5;
		// 현재 페이지에서 보여줄 게시물의 시작 번호
		int startNum = 0;
		// 현재 페이지에서 보여줄 게시물의 끝 번호
		int endNum = 0;
		int showNum= 10;
		/* 코드 작성 */
		startNum = nowPage * showNum - 9;
		endNum = nowPage * showNum;
		
		System.out.println("현재 페이지 : " + nowPage);
		System.out.println("시작 번호 : " + startNum);
		System.out.println("끝 번호 : " + endNum);
	}
}