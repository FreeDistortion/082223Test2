package oop.basic;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {return name;}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {return age;}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {return dept;}
	
	public void display() {
		System.out.println("이\t름: "+name+"\t나\t이: "+age+"\t부\t서: "+dept);
	}
}
