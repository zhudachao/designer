package prototype;

public class ConcreteProtype2 implements Prototype{

	public Object clone() {
		
		Prototype prototype=new ConcreteProtype2();
		return prototype;
	}

}