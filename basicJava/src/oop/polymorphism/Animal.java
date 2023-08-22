package oop.polymorphism;

public abstract class Animal {
	protected int speed;
	protected double distance;
	protected String species;
	public Animal() {}
	public Animal(int speed) {
		super();
		this.speed = speed;
	}
	public void print() {
		System.out.println(species+"의 이동거리="+distance);
	}
	public abstract void run();
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
