package observer02;


public class ConcreteObserver implements Observer{

	/* (non-Javadoc)
	 * @see observer02.Observer#update(observer.Subject)
	 */
	
	 private String observerState;

	public void update(Subject subject) {
		// TODO Auto-generated method stub
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("¹Û²ìÕß×´Ì¬Îª£º"+observerState);

	}

}
