package facade;

public class Computer {
	
	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer(){
		cpu=new Cpu();
		disk=new Disk();
		memory=new Memory();
	}
	
	public void start(){
		cpu.start();
		disk.start();
		memory.start();
	}
	public void close(){
		cpu.close();
		disk.close();
		memory.close();
	}

}
