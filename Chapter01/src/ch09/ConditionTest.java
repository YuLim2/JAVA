package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		System.out.println("�Է� ���� �� ���� ū ���� ����!?");
		int max;
		Scanner scanner = new Scanner(System.in);

		System.out.println("ù ��° ���� �Է� ��!: ");
		int x = scanner.nextInt();
		System.out.println("�� ��° ���� �Է� ��!: ");
		int y = scanner.nextInt();
		
		max = (x > y)? x : y;
		System.out.println(max);
	}
}
