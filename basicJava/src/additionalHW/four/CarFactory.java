package additionalHW.four;

public class CarFactory extends Factory implements IWorkingTogether{

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	
	public CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		switch (skill) {
		case 'A':
				skill= 3;break;
			case 'B':
				skill= 2;break;
			case 'C':
				skill= 1;break;
			default:
				skill= 0;
		}
		return (skill*getWorkingTime());
	}


	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		return (2*getWorkingTime());
	}

}
