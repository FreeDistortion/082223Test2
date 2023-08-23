package additionalHW.four;

public class TVFactory extends Factory implements IWorkingTogether{

	public TVFactory() {
		// TODO Auto-generated constructor stub
	}

	
	public TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
		// TODO Auto-generated constructor stub
	}



	@Override
	public int makeProducts(char skill) {
		// TODO Auto-generated method stub
		switch (skill) {
		case 'A':
				skill= 8;break;
			case 'B':
				skill= 5;break;
			case 'C':
				skill= 3;break;
			default:
				skill= 1;
		}
		return (skill*getWorkingTime());
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		return (3*getWorkingTime());
	}
	
}
