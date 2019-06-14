package ch09;

public class CarMain {

	static void driver(Car c) {
		c.move(20, 20);
		c.stop();
	}
	public static void main(String[] args) {
		Car_Pride c1 = new Car_Pride();
		driver(c1);
		Car_Ray c2 = new Car_Ray();
		driver(c2);
	}

}
