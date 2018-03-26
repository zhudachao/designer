package bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//该方法从xml文件中提取具体类雷鸣，并返回一个实例化对象
	public static Object getBean(String args){
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder=dFactory.newDocumentBuilder();			
			Document doc;			
			doc=dBuilder.parse(new File("config.xml"));
			
			NodeList nl=null;
			Node classNode=null;			
			String cName=null;
			nl=doc.getElementsByTagName("className");
			
			if(args.equals("image")){
				classNode=nl.item(0).getFirstChild();
			}else if(args.equals("os")){
				classNode=nl.item(1).getFirstChild();
			}
			
			cName=classNode.getNodeValue();
			System.out.println("类名："+cName);
			
//			return cName;
			
			Class<?>  c= Class.forName("bridge."+cName);
//			Class  c= ClassLoader.getSystemResource(name);
			Object obj=c.newInstance();
			return obj;	
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();return null;
		}
		
		
	}

}
