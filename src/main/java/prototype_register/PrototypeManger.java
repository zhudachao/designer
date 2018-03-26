package prototype_register;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManger {
	
	private static Map<String,Prototype> map=new HashMap<String, Prototype>();
	
	
	private PrototypeManger(){}
	
	
	public synchronized static void setPrototype(String prototypeId , Prototype prototype){
        map.put(prototypeId, prototype);
    }

	public synchronized static void removePrototype(String prototypeId){
        map.remove(prototypeId);
    }

	 public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
	        Prototype prototype = map.get(prototypeId);
	        if(prototype == null){
	            throw new Exception("��ϣ����ȡ��ԭ�ͻ�û��ע����ѱ�����");
	        }
	        return prototype;
	    }
	
	

}
