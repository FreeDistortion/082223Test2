package exception;
//사용자 정의 예외 클래스 만들기
//->	MyException을 exception class로 만들기 위해 상속해야 한다.
//		class를 정의할 때 is a 관계는 상속
//					   has a 관게는 멤버변수로 정의

public class MyException extends Exception{
	public MyException(String msg) {
		super(msg);//Exception class에 메시지를 전달
	}
}