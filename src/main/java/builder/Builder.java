package builder;

public  abstract class Builder {
	
	protected Cup cup =new Cup();
	
	public abstract void buildString();
	public abstract void buildCap();
	public abstract void buildCupBody();
	
	public Cup getResult(){
		return cup;
	}

}
