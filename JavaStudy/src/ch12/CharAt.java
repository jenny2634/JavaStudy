package ch12;

public class CharAt {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		int len = str.length();
		/* 
		 * for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
*/
		/*
		char c = 'A';
		c = (char) (c + 32);
		System.out.println(c);
		
		System.out.println((int) 'A');
		System.out.println((int) 'a');
		System.out.println((int) 'B');
		System.out.println((int) 'b');
		 */
		//�빮�ڸ� �ҹ��ڷ�
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			//�빮���̸� +32
			if(c>='A'&& c<='Z') {
				c = (char)(c+32);
			}

			System.out.println(c);
		}
	}
}