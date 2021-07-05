package co.yedam.exercise;

public class BookExample {
	public static void main(String[] args) {
		Book book1 = new Book();
		// System.out.println(book1.getTitle() + ", " + book1.getAuthor() + ", " +
		// book1.getPrice());

		Book book2 = new Book();
		book2.setTitle("Animal Farm");
		book2.setAuthor("George Orwell");
		book2.setPrice(6300);
		// System.out.println(book2.getTitle() + ", " + book2.getAuthor() + ", " +
		// book2.getPrice());

		Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 7200);

		Book[] books = new Book[5];
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		// 나머지 공간에는 null값

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor() + ", " + books[i].getPrice());
			}
		}
	} // end of main()
} // end of class
