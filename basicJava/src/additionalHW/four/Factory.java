package additionalHW.four;

public abstract class Factory {
	int openHour;
	int closeHour;
	private String name;
	
	
	public Factory() {}


	public Factory( String name, int openHour, int closeHour) {
		super();
		this.name = name;
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	
	public String getFactoryName() {
		return name;
	}
	
	public int getWorkingTime() {
		return (closeHour-openHour);
	}
	
	public abstract int makeProducts(char skill);
	
}
