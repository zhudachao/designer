package prototype;

public class ConcreteProtype1 implements Prototype{

	public Object clone() {
		
		Prototype prototype=new ConcreteProtype1();
		return prototype;
	}

}
