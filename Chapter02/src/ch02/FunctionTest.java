package ch02;

public class FunctionTest {
	//두 수의 합을 출력하는 함수
	public static int add(int num1, int num2) {
		return (num1 + num2);
	}
	//헬로우 + 이름 함수
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static int calcSum() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
	
		sum = add(10, 20);

		System.out.println(sum);
		sayHello("mrchoi");
		sum = calcSum();
		System.out.println(sum);
	}

}
