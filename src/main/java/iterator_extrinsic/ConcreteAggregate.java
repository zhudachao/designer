package iterator_extrinsic;




public class ConcreteAggregate extends Aggregate {
	
	public Object[] objArray=null;
	
	Iterator iterator=null;

	public ConcreteAggregate(Object[] objArray) {
		super();
		this.objArray = objArray;
	}



	
	public java.util.Iterator createIterator() {
//		 TODO Auto-generated method stub
//		return new ConcreteAggregate(this);
		return null;
	}

	public Object getElement(int index){
		if(index<objArray.length){
			return objArray[index];
		}else{
			return null;
		}
		}
	public int size(){
		return objArray.length;
	}
	}

