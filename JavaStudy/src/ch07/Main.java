package ch07;

public class Main {
	public static void main(String[] args) {
		 /* ������ ���� */
		 Human human = new Human();
		 human.setName("��");
		 human.setType('O');
		 human.setAge(20);

		 /* BloodHouse ��ü ���� */
		 BloodHouse bh = new BloodHouse();
		 String result = ""; 
		 bh.action(human);
		 System.out.println(result);
		 }

}



