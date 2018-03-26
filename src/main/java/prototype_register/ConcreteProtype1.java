package prototype_register;

public class ConcreteProtype1 implements Prototype{

	private String name;
	
	public Prototype clon(){
		
		ConcreteProtype1 prototype = new ConcreteProtype1();
	    prototype.setName(this.name);
	    return prototype;

		
	}
	
	 public String toString(){
	        return "Now in Prototype1 , name = " + this.name;
	    }


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public void setName(String name) {
	   
		this.name=name;
		
	}

}
