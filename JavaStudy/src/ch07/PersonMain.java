package ch07;

import java.util.Scanner;

public class PersonMain {

	static Person inputData() {
		Person p1 = new Person();

		Scanner s = new Scanner(System.in);

		System.out.println("����� ������ �Է����ּ���.");
		System.out.print("�̸�:");
		String name = s.nextLine();
		p1.name = name;
		System.out.print("Ű:");
		float height = s.nextFloat();
		p1.height = height;
		System.out.print("������:");
		float weight = s.nextFloat();
		p1.weight = weight;

		return p1;// �����ڷ������� �⺻�� null- �ƹ��͵� ����;

	}

	static void print(Person p) {

		System.out.printf("%s  %s  %s", p.name, p.height, p.weight);

	}

	public static void main(String[] args) {
		Person p1 = inputData();
		Person p2 = inputData();

		print(p1);
		print(p2);

	}
}
