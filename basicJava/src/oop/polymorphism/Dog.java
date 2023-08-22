package oop.polymorphism;

public class Dog extends Animal{
	
	public Dog(int speed) {
		super(speed);
		species="개";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		distance+=speed/2;
	}

	
}
