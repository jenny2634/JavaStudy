package ch12;

public class Data {//�ζǵ��ູ�� �ѹ� ã��
	public static void main(String[] args) {
		NetworkUtil u = new NetworkUtil();
		String result = u.get("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1");

		int sIdx = 0;//������ġ
		int eIdx = 0;//����ġ

		sIdx = result.indexOf("<div class=\"num win");
		eIdx = result.indexOf("</p>",sIdx);
		
		String div = result.substring(sIdx,eIdx);
		
		//System.out.println(div);
		
		int nsIdx = div.indexOf("\">");
		int neIdx = 0;
		String num ="";
		while(true) {
			nsIdx = div.indexOf("\">",nsIdx +1) +2;
			neIdx = div.indexOf("</span>",neIdx +1);
			if(nsIdx == -1 || neIdx == -1) break;
			num = div.substring(nsIdx, neIdx);
			System.out.println(num);
		}
		
	}

}
