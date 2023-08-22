package oop.polymorphism;

public abstract class Employee {
	private String name;
	private int num;
	private String department;
	private int salary;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, int num, String department, int salary) {
		super();
		this.name = name;
		this.num = num;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
