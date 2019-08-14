package parsing;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jsoup1 {
	public static void main(String[] args) throws IOException {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed");
		//Document <= html, css, js ���� ����
		Document doc = con.get();
		Elements elements = doc.select(".title > a");//a �±� ������
		for(int i=0; i< elements.size(); i++) {
			Element elem = elements.get(i); // a�±� �Ѱ��� ����
			String link = elem.attr("href");
			String s = elem.text();
			System.out.println(s + "/" + link);
			
		}
	}
}
