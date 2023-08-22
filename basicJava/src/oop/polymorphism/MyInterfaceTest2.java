package oop.polymorphism;
//6.	class가 interface와 class를 모두 상속하는 경우, class상속이 interface상속보다 먼저 정의되어야 한다.
//* 			e.g.
//* 			Class A extends Super implements InterA{
//* 			        -------
//* 			}  implements보다 먼저 정의 필.

interface ParentInterA{
	void testA();
}
interface ParentInterB{
	void testB();
}
class SuperClass{
	public void display() {
		System.out.println("superClass");
	}
}

class ChildClass extends SuperClass implements ParentInterA,ParentInterB{

	@Override
	public void testA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testB() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MyInterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		ParentInterA obj2=new ChildClass();
		ParentInterB obj3=new ChildClass();
		SuperClass obj4=new ChildClass();
		
	}

}
