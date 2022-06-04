package iterator;

public class BookShelfIterator implements Iterator{

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(Aggregate bookShelf) {
		this.bookShelf = (BookShelf)bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()) {
			return true;
		}
		else return false;
	}

	@Override
	public Object next() {
		if(index < bookShelf.getLength()) {
			Book book =  bookShelf.getBookAt(index);
			index++;
			return book;
		}
		return null;
	}

}
