package component;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		System.out.println("can not add to leaf");
		
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("can not remove from leaf");
		
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String temp="";
		for (int i = 0; i < depth; i++) {
			temp +='-';
			System.out.println(temp+name);
		}
	}

}
