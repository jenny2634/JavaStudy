package ch12;

class IndexOf {
	public static void main(String args[]) {
		//			  012345   89   12 15
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		
		int idx=-1;
		while(true) {
			idx = str.indexOf(" ",idx+1);
			System.out.println(idx);
			if(idx==-1) {
				break;
			}
		}
		/*
		int idx = str.indexOf(" ");
		System.out.println(idx);
		
		idx = str.indexOf(" ", idx +1);
		System.out.println(idx);

		idx = str.indexOf(" ", idx +1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", idx +1);
		System.out.println(idx);
		*/
	}
}