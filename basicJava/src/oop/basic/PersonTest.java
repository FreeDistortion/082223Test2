package oop.basic;
//Person class를 테스트하기 위한 class
public class PersonTest {
	public static void main(String[] args) {
		//new Person();//이 상태에선 heap(memory)에만 올라가있고 stack에 있지 않은 상태
		Person p1=new Person();
		
		System.out.println("성명: "+p1.name);
		System.out.println("주소: "+p1.addr);
//		System.out.println("나이: "+p1.age);
		
		p1.name="RM";
//		p1.age=30;
		p1.addr="Seoul";
		
		System.out.println("성명: "+p1.name);
		System.out.println("주소: "+p1.addr);
//		System.out.println("나이: "+p1.age);
		System.out.println("===================");
		
		Person p2=new Person();
		p2.name="Sugar";
//		p2.age=32;
		p2.addr="Daegu";
		
		System.out.println("성명: "+p2.name);
		System.out.println("주소: "+p2.addr);
//		System.out.println("나이: "+p2.age);
		
		
		
	}
}
