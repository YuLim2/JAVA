package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		System.out.println("입력 받은 두 수중 큰 수는 뭘깡!?");
		int max;
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 수를 입력 ㄲ!: ");
		int x = scanner.nextInt();
		System.out.println("두 번째 수를 입력 ㄲ!: ");
		int y = scanner.nextInt();
		
		max = (x > y)? x : y;
		System.out.println(max);
	}
}
