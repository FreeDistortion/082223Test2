package oop.polymorphism;

public class Chicken extends Animal implements Cheatable{

	public Chicken(int speed) {
		super(speed);
		species="닭";
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		distance+=speed;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		speed*=2;
		species="날으는 닭";
	}


}
