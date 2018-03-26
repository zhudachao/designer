package abstractFactory;

public class IntelFactory implements AbstractFactory {

	public Cpu createCpu() {
		return new IntelCpu(755);
	}

	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new IntelMainBoard(755);
	}

}
