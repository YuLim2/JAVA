package ch05;

public class Person {
	int high;
	int weith;
	String gender;
	int age;
	String name;
	
	
	public Person(int high, int weith, String gender, String name, int age) {
		this.age = age;
		this.gender = gender;
		this.high = high;
		this.name = name;
		this.weith = weith;
	}
	public void Info() {
	System.out.println("Ű�� " + high +" �̰� �����԰�  " + weith +" �� " + gender + "�� �ֽ��ϴ�."+ "�̸��� " + name + "�̰� ���̴�" + age + "�� �Դϴ�.");
	}
}
	