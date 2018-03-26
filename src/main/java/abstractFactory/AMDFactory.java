package abstractFactory;

public class AMDFactory implements AbstractFactory {

	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new AMDMainBoard(938);
	}

}
