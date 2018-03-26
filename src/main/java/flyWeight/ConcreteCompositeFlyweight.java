package flyWeight;

import java.util.HashMap;
import java.util.Map;


public class ConcreteCompositeFlyweight  implements Flyweight{
	
	//¸´ºÏÏíÔª
	
	private Map<String, Flyweight> files=new HashMap<String, Flyweight>();
	
	public void add(String instrinsicState,Flyweight fly){
		files.put(instrinsicState,fly);
	}
	
	
	public void operation(String state) {
        Flyweight fly =null;
        for(String instrinsicState:files.keySet()){
        	fly=files.get(instrinsicState);
        	fly.operation(state);
        }
	}

}
