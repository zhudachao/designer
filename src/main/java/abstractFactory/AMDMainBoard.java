package abstractFactory;

public class AMDMainBoard implements MainBoard {
	
private int cpuHoles =0;//cpu插槽孔数
	
	public AMDMainBoard(int cpuHoles){
		this.cpuHoles=cpuHoles;
	}

	public void installCpu() {
		System.out.println("AMD主板的插槽孔数是："+ cpuHoles);
	}

}
