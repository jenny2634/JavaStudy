package ch05;

public class Array1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[3] = 300;
		
		int[] scores = {10,20,30,40,50};
		
		int last = scores[scores.length -1];
		System.out.println(last);

//		System.out.println(arr[0]);
//		System.out.println(arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
		for(int a : arr) {
			System.out.println(a);
		}

	}
}
