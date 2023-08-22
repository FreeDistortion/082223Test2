package oop.polymorphism;
/*
 * <<Interface>>
 * ->	abstract method만 보관하는 특별한 class
 * 		interface를 사용하면 다형성을 적용할 수 있고 다중상속을 구현할 수 있다.
 * 		interface는 최상위타입으로 사용되는 특별한 class
 * 
 * 		1.	interface를 정의하는 방법은 interface 키워드를 이용해 정의
 * 		2.	interface는 abstract method만 정의하는 특별한 class
 * 			-	interface에 정의하는 method는 public과 abstract 생략 가능(abstract을 추가하지 않아도 abstract method로 인식)
 * 			-	하위class에서 override될 때 자동으로 public 추가
 * 			-	나머지 return type이나 variable은 normal method와 동일
 * 		3.	class가 interface를 상속하는 경우, extends가 아닌 implements 키워드를 이용해서 구현
 * 		4.	interface가 interface를 상속하는 경우 extends 키워드를 이용해서 구현
 * 			-	interface끼리 상속하는 경우 다중상속 가능
 * 			-	,를 이용해서 상속할 interface 정의
 * 		5.	class가 interface를 상속하는 경우, 다중상속이 가능하다.
 * 			-	,로 구분한다.
 * 		6.	class가 interface와 class를 모두 상속하는 경우, class상속이 interface상속보다 먼저 정의되어야 한다.
 * 			e.g.
 * 			Class A extends Super implements InterA{
 * 			        -------
 * 			}  implements보다 먼저 정의 필.
 * 
 */
interface SuperInterfaceA{
	void show();//public abstract void show();로 프로그램은 인식 중
	int test(String name);
}

interface InterA{
	void test();
}
interface InterB{
	void change();
}
interface ChildInter extends InterA,InterB{
	
}

class MyClass implements SuperInterfaceA,InterA{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int test(String name) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class MyInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
