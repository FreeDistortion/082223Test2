package oop.inheritance;
/*
 * 상속관계에서 constructor가 갖는 특징
 * 1.	모든 class의 최상위class는 java.lang.Object이다.
 * 		-> java에서는 객체가 갖는 공통의 특징을 java.lang.Object에 정의해놓고
 * 			상속하는 class가 없는 경우 compiler를 통해 자동으로 상속받을 수 있도록 하고 있다.
 * 		-> JVM에서 실행될 때 문제가 없으려면 내부에서 인식하는 공통의 타입을 갖고있어야 하며
 * 			java.lang.Object
 * 2.	상위class가 먼저 memory에 올라갈 수 있도록 모든 constructor의 첫 번째 문장에는 super()가 생력되어있다.
 *		즉, 상위class의 기본생성자를 호출하는 명령문이 생략
 *		   -----------------
 *			super()
 * 				|->	기본으로 부모의 default constructor가 호출되고 있우나, 명시적으로 variable이 있는 부모의 constructor를 호출 가능
 * 					명시적으로 부모의 constructor를 호출하면 compiler는 super()를 constructor읜 첫 문장에 추가하지 않는다.
 * 		-> 단, 생성자 호출문이 없는 경우
 * 			
 * 3.	부모에 variable이 있는 constructor를 호출하는 경우 super()를 이용
 * 		super(var1, var2, ...)
 * 		----------------------
 * 		|-> 부모 class에 variable이 있는 constructor를 호출
 * 4.	부모class는 직접 생성해서 쓰지 않으므로 부모가 갖고있는 field는 자식 object를 통해 설정하는 것이 일반적.
 * 5.	constructor는 상속되지 않는다.
 * 
 */

class SuperA extends Object{
	private String name;
	private int age;
	public SuperA() {
		super();
		System.out.println("부모의 생성자");
	}
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
class SubA extends SuperA{
	String subData;
	
	//보통은 하위class에서 상위class의 variables를 호출해 지정.
	//super(var1, var2, ...);
	public SubA(String name, int age, String subData) {
		super(name,age);
		this.subData=subData;
	}
	
	public SubA() {
//		super();
		System.out.println("자식의 생성자");
	}
}

class SuperB{
	String name;
	
	public SuperB(String name) {
		this.name=name;
	}
}
class SubB extends SuperB{
//	public SubB(){
//		super();
//	}
//	--------------
//	-> auto call
//	Parent class' default constructor isn't exist
	
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj=new SubA("NAME",333,"SUBDATA");
		//부모객체가 memory에 올라와 있어야 해당
	}

}
