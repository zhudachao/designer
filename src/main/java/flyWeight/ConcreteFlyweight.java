package flyWeight;

public class ConcreteFlyweight implements Flyweight {
	
	private String intrisicState=null;//����״̬
	
	

	public ConcreteFlyweight(String intrisicState) {
		super();
		this.intrisicState = intrisicState;
	}



	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("����״̬="+ this.intrisicState);
		System.out.println("����״̬="+ state);
	}

}
