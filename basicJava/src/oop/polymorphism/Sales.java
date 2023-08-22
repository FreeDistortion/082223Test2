package oop.polymorphism;

public class Sales extends Employee implements Bonus{
	public Sales() {}
	
	public Sales(String name, int num, String department, int salary) {
		super(name, num, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		double tempTax=getSalary();
		tempTax*=0.13;
		return tempTax;
	}
	public void incentive(int pay) {
		int tempSal=getSalary();
		tempSal+=(pay*1.2);
		setSalary(tempSal);
	}

}
