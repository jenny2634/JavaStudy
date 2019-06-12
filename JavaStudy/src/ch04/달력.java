package ch04;

import java.util.Calendar;

public class 달력 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//1. 현재 날짜 정보 알아내기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1 ;
		int day = cal.get(Calendar.DATE);

		System.out.println(""+year +month+day);
		System.out.println("" + year + "" +  month +"" + day);
		
		//2.날짜 지정하기
		cal.set(2012, 2, 27);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		day = cal.get(Calendar.DATE);
			
		System.out.println(""+year +month+day);
		
		//3. 날짜더하기(빼기) d-day
		cal.add(Calendar.DATE, 2890);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		day = cal.get(Calendar.DATE);
		System.out.println(""+year +month+day);
		
		//4.현재 월의 마지막 날짜 구하기
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
		
		
	}

}
