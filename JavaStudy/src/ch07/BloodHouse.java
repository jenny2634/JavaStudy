package ch07;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; 
		boolean isPossible = false; 
		age = human.getAge();
		if(age>=16&& age<=69) isPossible =  true;
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		return result;
	}
}