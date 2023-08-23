package additionalHW.four;

public class Tea extends Beverage{
	static int amount;

	
	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tea(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		amount++;
	}


	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		switch (getName()) {
		case "lemonTea": 
			price=1500;break;
		case "ginsengTea": 
			price=2000;break;
		case "redginsengTea": 
			price=2500;break;
		
	default:
	}
	}
	
}
