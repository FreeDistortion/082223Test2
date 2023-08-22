package oop.basic;

public class StaticMethodDemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemoTest2 obj=new StaticMethodDemoTest2();
		obj.display();
		test();
	}
	public void display() {
		System.out.println("display");
	}
	public static void test() {
		System.out.println("test");
	}
	
}
