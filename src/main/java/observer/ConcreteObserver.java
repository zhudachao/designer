package observer;

public class ConcreteObserver implements Observer{
	
	private String observerState;

	public void update(String state) {
		
		observerState =state;
		
		System.out.println("×´Ì¬Îª£º"+observerState);
		
	}

}
