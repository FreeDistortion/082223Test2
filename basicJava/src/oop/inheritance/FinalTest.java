package oop.inheritance;
/*
 * final
 * variable -> 상수로 정의할 때
 * method -> overriding할 수 없는 method로 정의할 때 
 * class -> inheritance할 수 없는 classs로 정의할 때
 */
final class A{
	public void test() {
		//일반method
	}
	public final void login(String pass) {
		//보안이 필요한 중요 method
		System.out.println("부모class의 중요한 method - 인증하고 액세스");
	}
}
class B extends A{
	public void login(String pass) {
		System.out.println("인증하지 않고 액세스하는 코드로 수정");
	}
}
public class FinalTest {
	static final int CODE = 100;
	public void test() {
		//CODE=200; 상수는 값을 재할당할 수 없다.
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.login("");
	}

}
