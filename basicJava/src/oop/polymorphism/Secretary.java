package oop.polymorphism;

public class Secretary extends Employee implements Bonus{
	public Secretary() {}
	
	public Secretary(String name, int num, String department, int salary) {
		super(name, num, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		double tempTax=getSalary();
		tempTax*=0.1;
		return tempTax;
	}
	
	public void incentive(int pay) {
		int tempSal=getSalary();
		tempSal+=(pay*0.8);
		setSalary(tempSal);
	}
}
