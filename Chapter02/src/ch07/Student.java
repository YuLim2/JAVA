package ch07;

public class Student {
	int num;
	String name;
	Subject korean;
	Subject math;
	
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanScore(int score) {
		korean.score = score;
	}
	public void setmathScore(int score) {
		math.score = score;
	}
	
	public void setKoreanName(String name) {
		korean.name = name;
	}
	public void setmathName(String name) {
		math.name = name;
	}
	public void showstudentScore() {
		int sum = korean.score + math.score;
		System.out.println(name +" 학생의 총점은 " + sum +" 입니다.");
	}
}
