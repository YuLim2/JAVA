package ch07;

public class StudentTest {

	public static void main(String[] args) {
		
		Student choi = new Student("choi", 100);
		Student kim = new Student("kim", 101);
		
		choi.setKoreanScore(100);
		choi.setmathScore(100);
		
		kim.setKoreanScore(50);
		kim.setmathScore(100);
		
		choi.showstudentScore();
		kim.showstudentScore();

	}

}
