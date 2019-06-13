package ch06;

public class test1 {
	public static void main(String[] args) {
		checkGrade(5);
		checkGrade(11);
		checkGrade(8);
		checkGrade(4);
	}

	static void checkGrade(int weight) {
		if(weight > 10) System.out.println(1);
		else if(weight > 7) System.out.println(2);
		else if(weight > 4) System.out.println(3);
		else System.out.println(4);
	}
}
