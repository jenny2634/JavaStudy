package Baekjun;

import java.util.Scanner;
import java.util.Stack;

public class Main_10828 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			String com = s.next();
			if (com.equals("push")) {
				int num = s.nextInt();
				stack.push(num);
				count++;
			} else if (com.equals("pop")) {
				if (count <= 0)
					System.out.println(-1);
				else {
					System.out.println(stack.pop());
					count--;
				}
			} else if (com.equals("size")) {
				System.out.println(stack.size());
			} else if (com.equals("empty")) {
				boolean b = stack.isEmpty();
				if (b == true)
					System.out.println(1);
				else
					System.out.println(0);
			} else if (com.equals("top")) {
				if (count <= 0)
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
		}
	}
}
