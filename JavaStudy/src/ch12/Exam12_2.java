package ch12;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		String[] str = file.split("/");
		
		for(String s : str) {
			System.out.println(s);
		}
	}
}
