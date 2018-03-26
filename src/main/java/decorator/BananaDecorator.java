package decorator;

public class BananaDecorator implements Basket {
	
	private Basket basket;

	public BananaDecorator(Basket basket) {
		super();
		this.basket = basket;
	}

	public void show() {
		// TODO Auto-generated method stub
		basket.show();
		System.out.println("A Banana");
	}
	
	
	

}
