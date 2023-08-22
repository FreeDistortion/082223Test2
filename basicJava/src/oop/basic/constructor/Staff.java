package oop.basic.constructor;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	public void display() {
		System.out.println("이\t름: "+name+"\t나\t이: "+age+"\t부\t서: "+dept);
	}

	public Staff(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
}
