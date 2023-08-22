package oop.basic.constructor;

public class Student {
	private String name;
	private int age;
	private int id;

	
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	//easy coding: alt+shift+s -> r -> select & generate
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
//	public void setName(String name) {
//		this.name=name;
//	}
//	public String getName() {return name;}
//	
//	public void setAge(int age) {
//		this.age=age;
//	}
//	public int getAge() {return age;}
//	
//	public void setId(int id) {
//		this.id=id;
//	}
//	public int getId() {return id;}
//	
	public void display() {
		System.out.println("이\t름: "+name+"\t나\t이: "+age+"\t학\t번: "+id);
	}
	
	public void print() {
		//display호출
		//-> 선언된 class가 도잉ㄹ하면 갹체 생성을 하지 않고 method를 바로 호출(기본)
		display();
	}
}
