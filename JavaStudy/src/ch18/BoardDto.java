package ch18;

public class BoardDto {
	private String title;
	private String content;

	public BoardDto(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

//	public void setTitle(String string) {
//		// TODO Auto-generated method stub
//		this.title = title;
//		
//	}
//
//	public void setContent(String string) {
//		// TODO Auto-generated method stub
//		this.content = content;
//	}
}
