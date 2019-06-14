package ch11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("https://dhlottery.co.kr/gameResult.do?method=byWin");
		System.out.println(result);
		
		
	}

}
