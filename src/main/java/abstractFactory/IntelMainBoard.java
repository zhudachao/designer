package abstractFactory;

public class IntelMainBoard implements MainBoard {
	
	private int cpuHoles =0;//cpu��ۿ���
	
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles=cpuHoles;
	}

	public void installCpu() {
		
		System.out.println("Intel�����cpu��ۿ����ǣ�"+cpuHoles);
	}

}
