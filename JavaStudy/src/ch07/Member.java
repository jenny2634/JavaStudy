package ch07;

// 기본이 되는 클래스 - java bean
//dto(data transfer object / vo(value object)
public class Member {
	private String id;
	String pw;
	String name;
	int age;
	
	//변수 <=> 메소드 1:1 매칭
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
