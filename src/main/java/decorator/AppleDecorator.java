package decorator;

public class AppleDecorator implements Basket{
	
	private Basket basket;
	
	

	public AppleDecorator(Basket basket) {
		super();
		this.basket = basket;
	}



	public void show() {
		// TODO Auto-generated method stub
		basket.show();
		System.out.println("An apple");
	}

}
