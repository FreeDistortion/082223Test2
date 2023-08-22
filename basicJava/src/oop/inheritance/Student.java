package oop.inheritance;

public class Student extends Person{
	private int id;
	public Student() {
		
	}
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display() {
		super.display();
		System.out.println("\t학\t번: "+id);
	}
}
