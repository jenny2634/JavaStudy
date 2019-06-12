package ch05;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] {
			{ 1, 2, 3 }, 
			{ 4, 5, 6 },
			{ 7, 8, 9 },
			{ 10, 11, 12 } 
			};
			
			int[] inner_arr = arr1[0]; //{1,2,3}
			int value = inner_arr[1]; //2

		int[][] arr2 = {
				{ 10, 20, 30 }, 
				{ 40, 50, 60 },
				{ 70, 80, 90 },
				{ 100, 110, 120 } };

		int[][] arr3 = new int[2][2];
		arr3[0][0] = 100;
		arr3[0][1] = 200;
		arr3[1][0] = 300;
		arr3[1][1] = 400;
	}
}
