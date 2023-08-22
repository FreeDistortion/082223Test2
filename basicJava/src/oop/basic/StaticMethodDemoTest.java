package oop.basic;
//StaticMethodDemo를 테스트 할 수 있는 class
public class StaticMethodDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo obj=new StaticMethodDemo();//constructor보다 static block이 선호출
		System.out.println(StaticMethodDemo.staticNum);
		System.out.println("-----------------------------------------------------");
		StaticMethodDemo obj2=new StaticMethodDemo();//static block 호출 X
		System.out.println("-----------------------------------------------------");
		
		//static method는 className.methodName() 으로 호출
		StaticMethodDemo.test();
		//일반 method는 instanceName.methodName 으로 호출
		obj2.display();
		//Integer class 에 정의된 parseInt method는 static method이므로 className으로 access해야 함.
		//숫자 형식의 문자열을 int type으로 변환하는 method
		int num=Integer.parseInt("100");
		System.out.println(num+200);
	}

}
