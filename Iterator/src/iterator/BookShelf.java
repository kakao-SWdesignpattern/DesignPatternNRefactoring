package iterator;

public class BookShelf implements Aggregate{

	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	@Override
	public int getLength() {
		return last;
	}

}
