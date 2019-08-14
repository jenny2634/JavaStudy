
public class Test2 {
	 static int getTotal() {
		
		int total = 0;
		for(int i=1; i<=1000; i++) {
			total +=1;
		}
		System.out.println(total);
		return total;
		
	}

	public static void main(String[] args) {
		
		int nn = getTotal();
		getTotal();
		getTotal();
		getTotal();
		
//		int num1 = 2324;		
//		int num2 = 1818;
//		System.out.println("2324 + 1818 = " +(num1+num2));
//		System.out.println(num1 + " + " + num2 + " = " + "\"" + (num1 + num2) + "\"");
//		System.out.println(num1+num2);

	}

}
