package abstractFactory;

public class IntelCpu implements Cpu {
	
	private int pins=0;//cpu�����
	
	public IntelCpu(int pins){
		this.pins=pins;
	}
	
	

	public void calculate() {
		System.out.println("IntelCpu ���������"+pins);
		
	}

}
