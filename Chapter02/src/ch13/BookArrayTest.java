package ch13;

public class BookArrayTest {

	public static void main(String[] args) {
		Book library[] = new Book[3];
		Book copyLibrary[] = new Book[3];
		
		library[0] = new Book("서유기", "킹유림");
		library[1] = new Book("용의자식", "킹유림");
		library[2] = new Book("용의딸", "킹유림");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		
		
		copyLibrary[0].setName("어린왕자");
		copyLibrary[0].setAuthor("생택쥐페리");
		
		int i = 0;
		for(Book book : library) {
			copyLibrary[i++] = book;
		}
		
		for(Book book : library) {
			System.out.println(book);
		}
		for(Book book : copyLibrary) {
			System.out.println(book);
		}
	}

}
