package ch12;

public class Substring {
	public static void main(String args[]) {
		//			  012345678
		String str = "Java ������ �缺�� ���� ����������!!";
		String str1 = str.substring(5);
		System.out.println(str1);

		String str2 = str.substring(0, 6);//6�� �������� ����
		System.out.println(str2);

		String str3 = str.substring(12, 15);
		System.out.println(str3);
	}
}