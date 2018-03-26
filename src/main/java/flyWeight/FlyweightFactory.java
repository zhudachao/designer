package flyWeight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
	
	//������Ԫ��������
	
	private Map<String,Flyweight> files=new HashMap<String, Flyweight>();
	
	public Flyweight factory(String instrinsicState){
		Flyweight fly=files.get(instrinsicState);
		if(fly==null){//�ȴӻ����в��Ҷ������Ǵ��ڷ��أ��������򴴽�
			fly=new ConcreteFlyweight(instrinsicState);
			files.put(instrinsicState,fly);
		}
		return fly;
	}
	
	public int getFlyweightSize(){
		return files.size();
	}
	
	/**
     * ������Ԫ��������
     */
    public Flyweight factory(List<String> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for (String intrinsicState : compositeState) {
            compositeFly.add(intrinsicState, this.factory(intrinsicState));
        }

        return compositeFly;
    }

	
	

}
