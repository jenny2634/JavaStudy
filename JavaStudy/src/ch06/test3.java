package ch06;

import java.util.Calendar;

public class test3 {
	
	
	public static void main(String[] args) {
		getLastYear(1);
		getLastYear(2);
		getLastYear(9);
		getLastYear(11);

	}

	static void getLastYear(int n) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019,n-1,1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(lastday);

	}

}
