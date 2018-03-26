package decorator;

public class DecorationPattern {
	public static void main(String[] args) {
		Basket basket=new Original();
		
		
		Basket myBasket=new AppleDecorator(new BananaDecorator(basket));
		myBasket.show();
	}

}
