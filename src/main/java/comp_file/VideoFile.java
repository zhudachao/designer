package comp_file;

public  class VideoFile extends AbstractFile {
	
	private String name;
	

	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		 System.out.println("�Բ��𣬲�֧�ָ÷�����");  
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		 System.out.println("�Բ��𣬲�֧�ָ÷�����");  
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		 System.out.println("�Բ��𣬲�֧�ָ÷�����");  
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		 System.out.println("----����Ƶ�ļ�'" + name + "'����ɱ��");  

	}

}
