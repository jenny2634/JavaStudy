package ch18;

import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		set.add(2);
		set.add(5);
		set.add(7);
		set.add(11);
		set.add(16);
		set.add(37);

		HashSet<Integer> set2 = new HashSet<>();

		//System.out.println(set.containsAll(set2));//전체 값 비교 라이브러리
		int count = 0;
		while(true) {
			set2.clear();
			while(set2.size()<6){
				set2.add((int)(Math.random()*45) + 1);
			}
			count++;
			if(set.containsAll(set2)) break;
			
		}
		System.out.println("최종 시도 횟수: "+count);
		

	}
}
