package oop.basic;
//method를 유형별로 정의 
public class MyMethod {
	//4. 매개변수 O, 리턴값 O method
	//-> 숫자(정수) 2개를 매개변수로 전달받아서 더한 후 결과를 리턴하는 method
	//-> method 선언부에 리턴타입이 정의되는 경우, method의 마지막 문장에서 결과값 리턴 필요.
	public int add(int num1, int num2) {
		int result=0;
		result=num1+num2;
		return result;
	}
	
	//3. 매개변수 2개, 리턴값 X method
	//-> 출력할 기호, 출력할 횟수를 매개변수로 전달받아 사용할 수 있도록 method 정의
	//-> MyMethodTest에서 호출해서 사옹
	//-> method명: display
	/*
	 * 주로 variable은 DB에서 다루는 col명과 일치하는 게 보편적. 
	 */
	public void display(String str, int count) {
		for(int i=1;i<=count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//2. 매개변수 1개, 리턴값 X method
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//1. 매개변수 X, 리턴값 X method
	// -> * 기호를 10회 출력하고 싶은 개발자만 활용 가능
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
