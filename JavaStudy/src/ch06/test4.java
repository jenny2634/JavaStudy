package ch06;

import java.util.Calendar;

public class test4 {

	public static void main(String[] args) {
		dilemma(true, true);
		dilemma(true, false);
		dilemma(false, true);
		dilemma(false, false);
	}

	static void dilemma(boolean xa, boolean xb) {

		if (xa) {
			if (xb) {
				System.out.println("A,B 둘다 5년 복역");
			} else {
				System.out.println("A 석방, B 10년 복역");
			}
		} else {
			if (xb) {
				System.out.println("A 10년 복역, B석방");
			} else {
				System.out.println("A,B 둘다 1년 복역");
			}
		}

	}

}
