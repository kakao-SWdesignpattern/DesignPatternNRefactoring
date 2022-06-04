package iterator.factory;

public interface Aggregate {
	 public abstract Iterator iterator(int type);
	 public int getLength();
}
