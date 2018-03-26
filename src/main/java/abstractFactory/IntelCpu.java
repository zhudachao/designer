package abstractFactory;

public class IntelCpu implements Cpu {
	
	private int pins=0;//cpuÕë½ÅÊı
	
	public IntelCpu(int pins){
		this.pins=pins;
	}
	
	

	public void calculate() {
		System.out.println("IntelCpu µÄÕë½ÅÊı£º"+pins);
		
	}

}
