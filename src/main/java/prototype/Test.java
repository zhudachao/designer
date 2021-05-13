package prototype;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		
		Prototype object= new Prototype();
		SerializableObject obj =new SerializableObject(11, "艾薇儿");
		object.setString("实例");
		object.setObj(obj);
//		Prototype cloneObject = (Prototype) object.clone();
		Prototype cloneObject = (Prototype) object.deepClone();
		System.out.println(object.toString());		
		System.out.println(cloneObject.toString());
		
		cloneObject.setString("实例1");
		obj.setName("霉霉");
		System.out.println(object.toString());		
		System.out.println(cloneObject.toString());
	
		
	}
	

}
