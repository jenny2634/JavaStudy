package ch06;

public class Method2 {

	static boolean signUp(String id, String pw) {
		// id �ڸ��� �˻�
		if (id.length() <= 4) {
			return false;
		}
		// pw �ڸ��� �˻�
		if(pw.length()<=4) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean result = signUp("abcd", "123");
		if(result) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
	}
}
