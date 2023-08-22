package oop.polymorphism;

public class RefTypeCastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj1=new Sub();
		Super obj2=new Sub();
		Super obj3=new Super();
		obj2=obj1;
		if(obj1==obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//instacneof 연산자는 참조하는 객체의 타입 평가
		if(obj1 instanceof Super) {
			System.out.println("Super 타입이다.");
		}else {
			System.out.println("Super 타입이 아니다.");
		}
		if(obj1 instanceof Sub) {
			System.out.println("Sub 타입이다.");
		}else {
			System.out.println("Sub 타입이 아니다.");
		}
		
		if(obj2 instanceof Super) {
			System.out.println("Super 타입이다.");
		}else {
			System.out.println("Super 타입이 아니다.");
		}
		if(obj2 instanceof Sub) {
			System.out.println("Sub 타입이다.");
		}else {
			System.out.println("Sub 타입이 아니다.");
		}
		

		if(obj3 instanceof Super) {
			System.out.println("Super 타입이다.");
		}else {
			System.out.println("Super 타입이 아니다.");
		}
		if(obj3 instanceof Sub) {
			System.out.println("Sub 타입이다.");
		}else {
			System.out.println("Sub 타입이 아니다.");
		}
	
	}

}
