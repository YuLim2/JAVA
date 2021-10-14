package ch04;

public class StudentTest {
		int number;
		String name;
		int grade;

		public StudentTest(int number, String name, int grade) {
			this.number = number;
			this.name  = name;
			this.grade = grade;
		}
		
		public void showStudentInfo() {
			System.out.println("학번은 " + number +" 이름은 " + name +" 학년은 " + grade + "학년이다 자신있으면 덤벼");
		}
}
