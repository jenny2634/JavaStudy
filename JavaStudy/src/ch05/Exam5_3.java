package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		char temp = ' ';
		
		for (int i = 0; i < nums.length; i++) {
			// �ڵ� �ۼ�
			int ran = (int)(Math.random()*7);
			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}
		
		//2. �迭 ��� �ٸ��ָ鼭 ����ϱ�
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i] + "\t");
			if((i+1)%3==0) {
				System.out.println();
			}
		}

		//System.out.println(nums);
	}
}