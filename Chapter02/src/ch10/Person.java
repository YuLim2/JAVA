package ch10;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		money -= 1300;
		subway.take(1300);
	}
	public void takeBus(Bus Bus) {
		money -= 200;
		Bus.take(200);
	}
	public void takeCar(Car car, GasStation gasStation) {
		money -= car.take(gasStation, 3);
	}
	public void showInfo() {
		System.out.println(name+"���� �ܾ��� " + money + "�Դϴ�.");
	}
}
