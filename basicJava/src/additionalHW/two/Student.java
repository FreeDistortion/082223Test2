package additionalHW.two;
public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
	

	public Student(String name, String subject, int fee) {
		super();
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}


	public static void main(String args[]){
		Student stu = new Student("장동건", "jspprogram", 
				500000);
		 stu.calcReturnFee();
		stu.print();
	}
	public void calcReturnFee() {
		if(subject=="javaprogram") {
			returnFee=fee*0.25;
		}else if(subject=="jspprogram") {
			returnFee=fee*0.20;
		}else {
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	public void print() {
		System.out.println(name+" 씨의 과정명은 "+subject+"이고, 교육비는 "+fee+"원이며 환급금은 "+returnFee+"원입니다.");
	}
}  
