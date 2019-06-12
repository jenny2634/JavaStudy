package ch04;

import java.util.Calendar;

public class 달력2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//현재 월의 1일로 날짜 설정
		cal.set(2019,5,1);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1 ;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("" + year + "" +  month +"" + day);
		System.out.println(week);//토요일
		
		
		//1일의 실제 요일 위치에 맞도록 반복문 작성 가능
		for(int i = 1; i<week;i++){
			System.out.print("\t");
		}
	
	
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for(int d= 1;d<=lastDay;d++) {
			System.out.print(d + "\t");
			
			if(week %7 ==0) {
				System.out.println();
			}
			week++;//일자가 증가될때 요일의 숫자도 같이 증가 
		}
		
		
		
	
		
		
	}

}
