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
		System.out.println(number+"?? ?????? ?ܾ??? "+number+"?̰? ???? ?°? ???? "+passengerCount+"?Դϴ?.");
	}
}
