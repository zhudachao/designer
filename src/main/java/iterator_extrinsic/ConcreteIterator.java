package iterator_extrinsic;

public class ConcreteIterator implements Iterator{
	
	private ConcreteAggregate agg;
	
	private int index=0;
	
	private int size =0;
	
	

	public ConcreteIterator(ConcreteAggregate agg) {
		super();
		this.agg = agg;
		this.index = 0;
		this.size = agg.size();
	}

	public void first() {
		index=0;
		
	}

	public void next() {
		if(index<size){
			index++;
		}
		
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return  (index>=size);
	}

	public Object currentItem() {
		// TODO Auto-generated method stub
		return agg.getElement(index);
	}

}
