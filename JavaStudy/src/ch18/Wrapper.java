package ch18;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
	public static void main(String[] args) {
		//기본 자료형 8가지 -> 참조자료형 (Wrapper Class)
		
		//List<int> list = new ArrayList<int>(); (x)
		List<Integer> list = new ArrayList<Integer>();
		
		String num = "1000.223";
		double dd = Double.parseDouble(num);
//		int nn = Integer.parseInt(num);
		
		boolean b = false;
		Boolean b2 = b;
		
		char c ='1';
		Character c2 = c;
		
		int i =10;
		Integer i2 = i;
		
		Object obj = 1000;
	}

}
