package component;

public abstract class Component {
	
	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depthSS);

}
