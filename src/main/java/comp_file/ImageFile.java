package comp_file;

public class ImageFile extends AbstractFile{
	
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷���");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		
		System.out.println("��֧�ָ÷���");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷���");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		 System.out.println("----��ͼ���ļ�'" + name + "'����ɱ��");  
		
	}

}
