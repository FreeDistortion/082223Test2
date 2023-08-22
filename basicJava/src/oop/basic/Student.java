package oop.basic;

public class Student {
	private String name;
	private int age;
	private int id;

	public Student() {
		
	}
	public Student(String name, int age, int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public void display() {
		System.out.println("이\t름: "+name+"\t나\t이: "+age+"\t학\t번: "+id);
	}
	
}
