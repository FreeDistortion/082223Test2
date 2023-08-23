package additionalHW.four;

public class Coffee extends Beverage{
	static int amount;
	
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		amount++;
	}


	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		switch (getName()) {
			case "Americano": 
				price=1500;break;
			case "CafeLatte": 
				price=2500;break;
			case "Cappuccino": 
				price=3000;break;
			
		default:
		}
	}
	
}
