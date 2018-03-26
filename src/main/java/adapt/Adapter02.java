package adapt;

public class Adapter02 {
	//¶ÔÏóÊÊÅäÆ÷
	
	private Adaptee adaptee;
	
	public Adapter02(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	
	public void sampleOperation1(){
		this.adaptee.sampleOperation1();
	}
	
	public void sampleOperation2(){
		//TODO
	}

}
