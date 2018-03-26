package factory;

public class computerEngineer {
	
	private Cpu cpu=null;
	private MainBoard mainBoard =null;
	
	public void makeComputer(int cpuType,int mainBoardType){
		
		prepareHardwares(cpuType, mainBoardType);
		
	}
	
	private void prepareHardwares(int cpuType,int mainBoardType){
		
		this.cpu=CpuFactory.createCpu(cpuType);
		this.mainBoard=MainBoardFactory.createMainBoard(mainBoardType);
	
	    this.cpu.calculate();
	    this.mainBoard.installCpu();
	
	
	}
			

}
