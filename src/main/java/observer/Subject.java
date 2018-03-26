package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> list=new ArrayList<Observer>();
	
	//注册观察者对象
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attach an observer");
	}
	//删除观察者对象
    public void detach(Observer observer){
    	list.remove(observer);
    	System.out.println("detach an observer");
    }
    //通知所有注册的对象
    public void nodifyObserver(String newState){
    	for (Observer observer : list) {
			observer.update(newState);
		}
    }
    
}
