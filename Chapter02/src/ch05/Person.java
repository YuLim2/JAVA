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
	System.out.println("키가 " + high +" 이고 몸무게가  " + weith +" 인 " + gender + "이 있습니다."+ "이름은 " + name + "이고 나이는" + age + "세 입니다.");
	}
}
	