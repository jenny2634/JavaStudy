package ch07;

public class Main {
	public static void main(String[] args) {
		 /* 清趋磊 沥焊 */
		 Human human = new Human();
		 human.setName("辫");
		 human.setType('O');
		 human.setAge(20);

		 /* BloodHouse 按眉 积己 */
		 BloodHouse bh = new BloodHouse();
		 String result = ""; 
		 bh.action(human);
		 System.out.println(result);
		 }

}



