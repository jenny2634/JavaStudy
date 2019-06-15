package homework;

public class Main {
	public static void main(String[] args) {
		 Human human = new Human();
		 human.setName("±è");
		 human.setType('O');
		 human.setAge(20);

		 BloodHouse bh = new BloodHouse();
		 String result = ""; 
		 result = bh.action(human);
		 System.out.println(result);
		 }

}



