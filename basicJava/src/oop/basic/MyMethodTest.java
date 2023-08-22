package oop.basic;
//MyMethod에 정의된 method를 사용
//->method 호출
public class MyMethodTest {
//			어떤 타입일지 모르니			
//				  ----		-------------
	public static void main(String[] args) {
//	------
//사용자가 어디에 패키지를 만들지 모르니깐 public
		
		MyMethod obj = new MyMethod();
		System.out.println("===Start Program===");

		//1. 매개변수 X, 리턴값 X method 호출
		// -> method의 호출결과를 변수에 저장하지 않으면 void method
		obj.display();
		System.out.println("+++Step01+++");
		obj.display();
		obj.display();
		System.out.println("+++Step02+++");
		obj.display();
		
		//2. 매개변수 1개, 리턴값 X method
		obj.display("O");
		obj.display("§");
		obj.display("◆");
		
		//3. 매개변수 2개, 리턴값 X method
		obj.display("B", 6);
		
		MyMethodDemo demo= new MyMethodDemo();
		demo.printGuGu();
		demo.printGuGu(14);
		
		//4. 매개변수 O, 리턴값 O method
		//4.1. 리턴값이 있는 method 호출의 경우 리턴값과 동일 타입의 변수를 선언해 리턴값 저장.
		int resultData=obj.add(100,200);
		System.out.print("method 호출 결과: "+resultData);
		if(resultData>200) {
			System.out.println("완료");
		}else {
			System.out.println("다시 작업");
		}
			
		//4.2. method의 호출 결과를 다른 method의 매개변수로 전달하거나 바로 호출해 작업 가능.
		System.out.print("method 호출 결과: "+obj.add(100,200));
		if(obj.add(100,200)>200) {
			System.out.println("완료");
		}else {
			System.out.println("다시 작업");
		}

	}

}
