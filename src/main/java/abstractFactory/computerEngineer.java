package abstractFactory;

public class computerEngineer {
	
	private Cpu cpu=null;
	private MainBoard mainBoard =null;
	
	public void makeComputer(AbstractFactory af){
		
		prepareHardwares(af);
		
	}
	
	private void prepareHardwares(AbstractFactory af){
		
		this.cpu=af.createCpu();
		this.mainBoard=af.createMainBoard();
	
	    this.cpu.calculate();
	    this.mainBoard.installCpu();
	
	
	}
			

}
