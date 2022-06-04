package iterator.factory;

public class IteratorFactory extends Factory{

	private static IteratorFactory ifactory = new IteratorFactory();
	private IteratorFactory(){}
	
	public static IteratorFactory getInstance(){
		
		if(ifactory == null)
			ifactory = new IteratorFactory();
		return ifactory;
	}

	@Override
	protected Iterator createProduct(Aggregate list, int type) {
		if(type == Constant.FORWARD)
			return new BookShelfIterator(list);
		else if(type == Constant.REVERSE)
			return new ReverseIterator(list);
		else 
			return null;

	}

}
