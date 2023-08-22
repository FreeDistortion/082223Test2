package oop.polymorphism;
/*
 * abstract class(추상클래스)
 * ->	상위class의 역할을 하는 class
 * ->	객체를 생성할 수 없는 class(미완성 class)
 * ->	내용이 구현되어있지 않은 method를 포함하고 있는 class를 abstract class라 한다.
 * 		-----------------
 * 		abstract method(body가 없는 method)
 * 
 * Q. 왜 추상클래스를 만드는지 유념
 * 1)	abstract method 선언 방법
 * 		[문법]
 * 		접근제어자 abstract 리턴타입 메서드명(매개변수1, 매개변수2, ...);
 * 2)	abstract class 특징
 * 		- abstract method가 하나라도 정의되어 있으면 abstract class가 된다.
 * 			따라서 abstract class는 선언부에 abstract를 추가해야만 한다.
 * 		- abstract class에는 abstract method와 normal method를 모두 정의할 수 있다.
 * 		- abstract class는 객체 생성을 할 수 없는 class
 * 		- abstract class를 상속받는 class는 extends하면 err
 * 			-> 자식이 부모를 상속받을 때 부모에 있는 모든 member가 자식의 소유가 되는데,
 * 				이 때 자식은 부모의 abstract class를 소유하므로 자식도 abstract class가 된다.
 * 		[handling err]
 * 		1.	자식의 선언문에 abstract를 추가.
 * 		2.	자식이 상속받은 abstract method를 overriding(재정의)한다.
 * 
 * 		- abstract class는 상위class로 사용하기 위해 정의(상위class로 사용할 목적으로 정의되며 실제 타입으로 선언되어 사용).
 * 		- abstract method는 하위class에서 반드시 overriding되어야 한다는 것을 문법적으로 제시.
 */

abstract class Parent{
	public void test() {
		System.out.println("test - normal method");
	}
	
	//추상메서드
	public abstract void display(String msg);
}
class Child extends Parent{

	@Override// <- annotation: (간략)compiler에게 설명해주기 위한 표시
	public void display(String msg) {
		System.out.println("display");
	}//abstract display
	
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent obj=new Parent();
		Parent obj=new Child();
		obj.display(null);
	}

}
