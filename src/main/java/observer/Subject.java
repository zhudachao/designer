package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> list=new ArrayList<Observer>();
	

	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attach an observer");
	}
	
    public void detach(Observer observer){
    	list.remove(observer);
    	System.out.println("detach an observer");
    }
    
    public void nodifyObserver(String newState){
    	for (Observer observer : list) {
			observer.update(newState);
		}
    }
    
}
