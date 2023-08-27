package HW.oop;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.setName("홍길동");
		emp.setId("12345");
		emp.setBaseSalary(50000);
		emp.getSalary(30);
		System.out.println(emp.toString()+"\n봉급 = "+emp.getSalary(30));
	}

}
