package ch06;

public class Order {
	String ordernum;
	String phonenum;
	String adress;
	int date;
	int time;
	int money;
	String menu;
	String num;
	
	public Order() {}
	
	public Order(String ordernum, String phonenum, String adress, int date, int time, int money, String menu, String num) {
		this.ordernum = ordernum;
		this.phonenum = phonenum;
		this.adress = adress;
		this.date = date;
		this.time = time;
		this.money = money;
		this.menu = menu;
		this.num = num;
	}
	public void Info() {
		System.out.println(ordernum);
		System.out.println(phonenum);
		System.out.println(num);
		System.out.println(adress);
		System.out.println(date);
		System.out.println(time);
		System.out.println(money);
		System.out.println(menu);
	}
}
