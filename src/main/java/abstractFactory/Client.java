package abstractFactory;

public class Client {
	public static void main(String[] args) {
		computerEngineer ce=new computerEngineer();
		
		AbstractFactory af=new IntelFactory();
		
		ce.makeComputer(af);
	}

}
