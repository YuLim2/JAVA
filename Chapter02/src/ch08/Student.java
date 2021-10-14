package ch08;

public class Student {

	public static void main(String[] args) {
		
		StudentTest mrchoi = new StudentTest(100, "mrchoi", 1);
		StudentTest kim = new StudentTest(101, "kim", 2);
		
		kim.setName("kam");
		
		mrchoi.showStudentInfo();
	}

}
