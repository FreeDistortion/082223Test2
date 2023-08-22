package oop.polymorphism;
//	object 형변환
//	reference type에서의 형변환은 상속관계에서만 성립.

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

class Super{
	String data="상위class";
	
	public void display() {
		System.out.println("상위class의 display()");
	}
}

class Sub extends Super{
	String data="하위class";
	public void display() {
		System.out.println("하위class의 display()");
	}
	public void test() {
		System.out.println("하위class의 test()");
	}
}

public class RefTypeCastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCollection c1=new Vector();
		AbstractList c2=new Vector();
		AbstractList c3=new Stack();
		Vector c4=new Stack();
//		ArrayList c5=new Vector();
		System.out.println("1.\tSuper type의 reference variable로 Super object 사용");
		Super obj1=new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("----------------------------------------------");
		System.out.println("2.\tSub type의 reference variable로 Sub object 사용");
		Sub obj2 = new Sub();
		obj2.display();//overriding된 method가 호출순위 높음
		System.out.println(obj2.data);//obj2 variable이 어떤 타입이냐에 따라 해당 타입이 갖고있는 variable이 호출
									//	상속관계에서 동일한 타입의 variable이 있는 경우 상위타입보단 나의 variable이 우선 인식
		System.out.println("----------------------------------------------");
		System.out.println("3.\tSuper type의 reference variable로 Sub object 사용");
		//자동형변환
		//명시적형변환을 통해 Sub객체 참조 가능.		
		//obj3 참조변수가 Super 타입이므로 Super의 member만 접근 가능
		//단, Sub 객체를 참조하므로 overriding된 method가 있는 경우 override method가 먼저 실행
		//new Sub()가 가능한 이유는 Sub 객체가 참조변수 타입인 Super정보를 갖고있으므로 가능
		Super obj3 = new Sub();
		obj3.display();
		System.out.println(obj3.data);

		//obj3이 Super 타입이므로 Super의 member만 사용 가능하지만, 참조하는 객체가 Sub타입이므로 명시적형변환 가능
		((Sub)obj3).test();
		System.out.println(((Sub)obj3).data);
		
		System.out.println("----------------------------------------------");
		System.out.println("4.\tSub type의 reference variable로 Super object 사용 - impossible");
		//실제 사용되는 variable의 타입에 대한 정보가 생성되는 객체에 없기 때문에 사용할 수 없다.
//		Sub obj4=new Super();
		
		System.out.println("----------------------------------------------");
		System.out.println("5.\tSub type의 variable = Super object를 참조하는 variable - impossible");
		//상속관계에선 명시적casting을 하면 compiler는 디코잉 가능.
		//obj1이 참조하는 객체가 Super이므로 실행될 때 casingErr.
//		Sub obj5=(Sub)obj1;
		
		System.out.println("----------------------------------------------");
		System.out.println("6.\tSub type의 = Sub object를 참조하는 variable - possible");
		//obj3은 Super 타입이므로 auto casting은 불가
		//명시적캐스팅하면 가능: obj1과 다르게 실제 참조하는 객체가 Sub타입이므로 reference variable의 모든 정보를 갖고 있으므로 가능
		Sub obj6=(Sub)obj3;
		
	}

}
