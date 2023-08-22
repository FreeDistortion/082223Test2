package oop.polymorphism;

abstract public class Shape {
	protected double area;
	private String name;

	public Shape() {}

	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract void calculationArea();
	public void print() {
		System.out.println(name+"의 면적은"+area);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
