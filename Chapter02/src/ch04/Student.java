package ch04;

public class Student {

	public static void main(String[] args) {
		
		StudentTest mrchoi = new StudentTest(100, "mrchoi", 1);
		
		mrchoi.number = 100;
		mrchoi.name = "mrchoi";
		mrchoi.grade = 1;
		
		mrchoi.showStudentInfo();
	}

}
