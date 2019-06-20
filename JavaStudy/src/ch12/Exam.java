package ch12;

public class Exam {
	public static void main(String[] args) {
		String text ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		int idx1=-1;
		int count1 =0;
		int idx2=-1;
		int count2=0;
		
		while(true) {
			idx1 = text.indexOf("Lorem",idx1+1);
			count1++;
		
			if(idx1==-1) {
				count1--;
				break;
			}
		}
		System.out.println("Lorem: " +count1);
		
		while(true) {
			idx2 = text.indexOf("Ipsum",idx2 +1);
			count2++;
			
			if(idx2==-1) {
				count2--;
				break;
			}
		}
		System.out.println("Ipsum: " +count2);
		/*
		int idx1 = -2; // Lorem index
		int idx2 = -2; // Ipsum index
		int lorem = 0; // Lorem 개수
		int ipsum = 0; // Ipsum 개수
		
		while(true) {
			if(idx1 != -1) {
				idx1 = text.indexOf("Lorem", idx1 + 1);
				lorem++;
			}
			if(idx2 != -1) {
				idx2 = text.indexOf("Ipsum", idx2 + 1);
				ipsum++;
			}
			if(idx1 == -1 && idx2 == -1)  break;
		}
		System.out.printf("Lorem %d, Ipsum %d", lorem, ipsum);
		*/

	}
}
