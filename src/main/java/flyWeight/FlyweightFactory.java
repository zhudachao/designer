package flyWeight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
	
	//具体享元工厂方法
	
	private Map<String,Flyweight> files=new HashMap<String, Flyweight>();
	
	public Flyweight factory(String instrinsicState){
		Flyweight fly=files.get(instrinsicState);
		if(fly==null){//先从缓存中查找对象，若是存在返回，不存在则创建
			fly=new ConcreteFlyweight(instrinsicState);
			files.put(instrinsicState,fly);
		}
		return fly;
	}
	
	public int getFlyweightSize(){
		return files.size();
	}
	
	/**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<String> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for (String intrinsicState : compositeState) {
            compositeFly.add(intrinsicState, this.factory(intrinsicState));
        }

        return compositeFly;
    }

	
	

}
