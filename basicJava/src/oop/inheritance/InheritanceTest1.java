package oop.inheritance;
/*
 * 상속관계에서 field가 갖는 특징
 * 1.	상속관계에서 상위class에 선언된 field는 하위class에서 접근 가능.
 * 2.	상위class에서 선언된 변수와 동일한 이름의 field를 하위class에서 정의하면
 * 		하위class 내부에서는 상위class의 field보다 하위class의 field 우선순위가 높음
 *		(외부에서 사용되는 경우, 선언된 참조변수의 타입의 어떤 것이냐에 따라 상이)
 * 3.	하위class 내부에서 상위class의 member에 접근하고 싶으면 super 키워드를 이용해 접근.
 * 		this -> 자기 자신의 객체
 * 		super -> 부모객체
 * 4.	상위class의 member가 private으로 정의되었다면, 하위class에서 접근 불가.
 * 
 * 
 * 주로 상위 class는 type으로만 쓰고, 하위class를 만들어서 쓴다.
 */
class Super{
	private int num=10;
}
class Sub extends Super{
	int num=100;
	public void display() {
		System.out.println("num-> "+num);
		System.out.println("부모의 num-> "+super.num);//private이므로 access fail
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj=new Sub();
		obj.display();
		System.out.println("obj.num-> "+obj.num);
		
		Super obj2=new Sub();
		System.out.println("obj.num-> "+obj2.num);
		
	}

}
