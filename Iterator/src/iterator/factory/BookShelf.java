package iterator.factory;

public class BookShelf implements Aggregate{

	private Book[] books;
	private int last = 0;
	
	Factory f = IteratorFactory.getInstance();
	
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
	public Iterator iterator(int type) {
		Iterator i = f.create(this, type);
		return i;
	}

	@Override
	public int getLength() {
		return last;
	}

}
