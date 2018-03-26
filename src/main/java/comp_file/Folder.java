
package comp_file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
	
	private List<AbstractFile> fileList=new ArrayList<AbstractFile>();
	
	private String name;
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
		
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		
		//递归调用成员构件的killVirus方法
		
//		for (int i = 0; i < fileList.size(); i++) {
//			fileList.get(i).killVirus();
//		}
		
		for (AbstractFile file : fileList) {
			file.killVirus();
		}
		
	}

}
