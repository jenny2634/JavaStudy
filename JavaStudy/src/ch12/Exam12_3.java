package ch12;

public class Exam12_3 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		// �ڵ� �ۼ�
		String txt="";
		int idx = -1;
		while(true) {
			idx = str.indexOf(" ",idx+1);
		
			if(idx==-1) {
				txt = str.substring(0);
				System.out.println(txt);
				break;
			}
			else{
				txt = str.substring(0,idx);
				System.out.println(txt);
			}
		
		}
	}
}
