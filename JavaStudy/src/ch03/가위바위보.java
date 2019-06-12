package ch03;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("가위:0, 바위:1, 보:2 입력해주세요");
		int 나 = s1.nextInt();
		
		//방법1
		double ran = Math.random() *3;//ran은 0.0이상 1.0이하
		//방법2
		Random random = new Random();
		int ran2 = random.nextInt(3);//0~2사이 숫자
		
		int 상대방 = (int)ran;
		System.out.println("상대방이 낸 숫자: "+ 상대방);

		if ((나 + 1) % 3 == 상대방) {// 내가 짐
			System.out.println("짐");
		} else {
			if (나 == 상대방) {// 비김
				System.out.println("비김");
			} else {// 이김
				System.out.println("이김");
			}
		}
	}
}
