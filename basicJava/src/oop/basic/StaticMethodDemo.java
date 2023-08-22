package oop.basic;
//static method의 특징과 static block
public class StaticMethodDemo {
	static int staticNum;
	//static block - classloader에 의해 class에 대한 정보가 method area에 올라갈 때 한 번 실행
	static {
		staticNum=100;
		System.out.println("static block - class가 loading될 때 한 번 실행하는 code를 정의할 목적");
		System.out.println("static block - 자원에 대한 정보를 한 번 인식시키거나 엑세스 할 때");
		System.out.println("static block - class가 loading될 때 한 번 실행되므로 static variable을 초기화할 목적");
	}
	
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo's default constructor");
	}
	//static method와 non-static method의 차이점과 사용법
	//static method는 static member의 값을 조작하거나 utility처럼 method를 편하게 사용하기 위한 목적 자원을 access하거나, 모든 객체에서 공통으로 사용하는 기능을 표현하는 경우 사용
	public static void test() {//	static method
		//1. static method에서 static method 호출
		//->	일반적인 방법으로 접근
		//		---------
		//자신의 class 내부에서 선언된 method는 메서드명만 입력해 호출 가능.
		show();
		System.out.println("test");
		
	}
	public void display() {//		instance method
		//2. non-static method에서 non-static method 호출
		//->	일반적인 방법으로 접근
		change();
		System.out.println("display");
		
		}
	public void change() {//		instance method
		//3. non-static에서 static
		//->	일반적인 방법으로 접근
		show();
		System.out.println("change");
		
	}
	public static void show() {//	static method
		//4. static에서 non-static
		//show()가 memory에 있는 상태에서 바로 examTest를 확인할 수 없음 -> err
		//같은 class에 정의된 method라고 하더라도 static method 안에서 non-static method 호출의 경우
		//	객체 생성 후 참조변수를 통해서 호출
		StaticMethodDemo obj=new StaticMethodDemo();
		obj.examTest();
		System.out.println("show");

	}
	public void examTest() {//		instance method
		System.out.println("examTest");
	}

}
