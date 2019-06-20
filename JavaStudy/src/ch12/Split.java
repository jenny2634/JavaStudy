package ch12;

public class Split {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		for (String s : strs) {
			System.out.println(s);
		}
	}
}