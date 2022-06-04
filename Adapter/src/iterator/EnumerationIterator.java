package iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object>{

	Enumeration<?> enumeration;
	
	EnumerationIterator(Enumeration<?> enumeration){
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
