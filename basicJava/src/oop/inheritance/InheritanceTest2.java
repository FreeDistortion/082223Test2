package oop.inheritance;
/*
 * 상속관계에서 method가 갖는 특징
 * 1.	상위class에서 정의된 method를 하위class에서 호출할 수 있다.
 * 		-> 하위class type의 참조변수를 통해서도 상위class의 method를 사용할 수 있다.
 * 2.	상위class에 정의된 method와 동일한 method를 하위class에 정의하면 하위class의 method가 우선 인식.
 * 		-> 상위class에 정의된 method의 시그니처(리턴타입, 메서드명, 매개변수 개수, 매개변수 타입)가 동일한 경우
 * 			이를 메서드 재정의 즉, overriding이라 한다. 
 * 
 */
class Parent{
	public void display() {
		System.out.println("부모class의 display()");
	}
}
class Child extends Parent{
	public void test() {
		System.out.println("자식class의 test()");
		
		display();
		
		super.display();
	}
	public void display() {
		System.out.println("자식class의 display()");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.display();
		obj.test();
	}

}
