package homework;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; 
		boolean isPossible = false; 
		age = human.getAge();
		if(age>=16&& age<=69) isPossible =  true;
		return isPossible;
	}

	public String action(Human human) {
		String result = "";
		if(this.isPossible(human)) {
			result = "������ �Ϸ�Ǿ����ϴ�.\n" + human.getName() +"�� �����մϴ�";
		}else {
			result = "������ �Ұ����մϴ�.";
		}
		
		return result;
	}
}