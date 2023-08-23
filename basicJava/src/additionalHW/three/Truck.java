package additionalHW.three;

public class Truck extends Wheeler{

	public Truck() {}
	public Truck(String carName,int velocity,  int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	public void speedUp(int speed) {
		velocity+=speed*5;
		if(velocity>100) {
			velocity=100;
			System.out.println("트럭의 최고속도 위반으로 속도를 100으로 내립니다.");
		}
		else {
			System.out.println("트럭의 현재 속도는 "+velocity+" 입니다.");
		}
	}
	public void speedDown(int speed) {
		velocity-=speed*5;
		if(velocity<50) {
			velocity=50;
			System.out.println("트럭의 최저속도 위반으로 속도를 50으로 올립니다.");
		}else {
			System.out.println("트럭의 현재 속도는 "+velocity+" 입니다.");
		}
	}
	
}