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
			System.out.println("�й��� " + number +" �̸��� " + name +" �г��� " + grade + "�г��̴� �ڽ������� ����");
		}
}
