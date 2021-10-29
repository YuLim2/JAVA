package ch13;

public class BookArrayTest {

	public static void main(String[] args) {
		Book library[] = new Book[3];
		Book copyLibrary[] = new Book[3];
		
		library[0] = new Book("������", "ŷ����");
		library[1] = new Book("�����ڽ�", "ŷ����");
		library[2] = new Book("���ǵ�", "ŷ����");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		
		
		copyLibrary[0].setName("�����");
		copyLibrary[0].setAuthor("�������丮");
		
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
