package abstractFactory;

public class IntelMainBoard implements MainBoard {
	
	private int cpuHoles =0;//cpu插槽孔数
	
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles=cpuHoles;
	}

	public void installCpu() {
		
		System.out.println("Intel主板的cpu插槽孔数是："+cpuHoles);
	}

}
