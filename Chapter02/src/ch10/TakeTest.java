package ch10;

public class TakeTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("yesterdayMrchoi", 5000);
		Person p2 = new Person("todayMrchoi", 20000);

		Subway brown = new Subway(3);
		Bus bus7_2 = new Bus("7_2");
		Car myCar = new Car("myCar");
		GasStation suyeong = new GasStation("suyeong");
		
		p1.takeSubway(brown);
		p1.takeBus(bus7_2);
		p1.takeCar(myCar, suyeong);
		
		p1.showInfo();
		p2.showInfo();
		
		brown.showInfo();
		bus7_2.showInfo();
		suyeong.showInfo();
	}

}
