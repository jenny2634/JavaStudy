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
			result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.\n" + human.getName() +"´Ô °¨»çÇÕ´Ï´Ù";
		}else {
			result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.";
		}
		
		return result;
	}
}