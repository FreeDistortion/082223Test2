package additionalHW.three;


public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;
	public Wheeler() {}
	public Wheeler(String carName, int velocity, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {
	}

	public void speedDown(int speed) {
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
}