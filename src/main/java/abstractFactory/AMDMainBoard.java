package abstractFactory;

public class AMDMainBoard implements MainBoard {
	
private int cpuHoles =0;//cpu��ۿ���
	
	public AMDMainBoard(int cpuHoles){
		this.cpuHoles=cpuHoles;
	}

	public void installCpu() {
		System.out.println("AMD����Ĳ�ۿ����ǣ�"+ cpuHoles);
	}

}
