package flyWeight;

public class ConcreteFlyweight implements Flyweight {
	
	private String intrisicState=null;//ÄÚÔÌ×´Ì¬
	
	

	public ConcreteFlyweight(String intrisicState) {
		super();
		this.intrisicState = intrisicState;
	}



	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("ÄÚÔÌ×´Ì¬="+ this.intrisicState);
		System.out.println("ÍâÔÌ×´Ì¬="+ state);
	}

}
