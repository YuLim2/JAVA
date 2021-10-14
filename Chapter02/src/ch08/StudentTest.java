package ch08;

public class StudentTest {
		private int number;
		private String name;
		private int grade;
		
		public StudentTest() {}

		public StudentTest(int number, String name, int grade) {
			this.number = number;
			this.name  = name;
			this.grade = grade;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public String getName() {
			return name;
		}
		
		public void showStudentInfo() {
			System.out.println("�й��� " + number +" �̸��� " + name +", " + grade + "�г��̴� �ڽ������� ����");
		}
}
