package prototype_register;

public class ConcreteProtype2 implements Prototype{

	private String name;
	
	public Prototype clon(){
		
		ConcreteProtype2 prototype = new ConcreteProtype2();
	    prototype.setName(this.name);
	    return prototype;

		
	}
	
	 public String toString(){
	        return "Now in Prototype2 , name = " + this.name;
	    }


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public void setName(String name) {
	   
		this.name=name;
		
	}

}
