package oop.basic.constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		//1. 컴파일러가 기본 생성자(default constructor)를 제공(생성자를 정의하지 않는 경우)
		//-> 객체 생성 후 생성된 객체가 제공하는 setter method를 통해서 값 재설정 
		Constructor obj=new Constructor();
		obj.setName("Lisa");
		obj.setId("BlackPink");
		/*
		 * 
		 */
		
		//2. 매개변수 7개인 constructor 호출
		//-> 객체를 생성하며 객체에 정의된 field 7개를 초기화.
		Constructor obj2=new Constructor("Rose", "BP", "BP1", "Seoul", "01012341234", "11", "Rosee");
		
		System.out.println("name: "+obj.getName());
		System.out.println("name: "+obj.getId());
		System.out.println("---------------------------");
		
		System.out.println("name: "+obj2.getName());
		System.out.println("name: "+obj2.getId());
		System.out.println("---------------------------");
		
		Constructor obj3=new Constructor("Jisoo", "BP", "BP1", "Seoul", "01012341234", "11", "Rosee",1000);
		System.out.println("name: "+obj3.getName());
		System.out.println("name: "+obj3.getId());
		System.out.println("---------------------------");
		
	}

}
