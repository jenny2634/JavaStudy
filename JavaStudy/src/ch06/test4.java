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
				System.out.println("A,B �Ѵ� 5�� ����");
			} else {
				System.out.println("A ����, B 10�� ����");
			}
		} else {
			if (xb) {
				System.out.println("A 10�� ����, B����");
			} else {
				System.out.println("A,B �Ѵ� 1�� ����");
			}
		}

	}

}
