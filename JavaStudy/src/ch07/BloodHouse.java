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
		String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
		/* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
		/* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
		/* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. */
		return result;
	}
}