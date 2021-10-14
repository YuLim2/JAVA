package ch10;

public class Bus {
	String number;
	int money;
	int passengerCount;
	
	public Bus(String number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(number+"번 버스의 잔액은 "+number+"이고 현재 승객 수는 "+passengerCount+"입니다.");
	}
}
