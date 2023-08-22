package exception;

import java.util.Scanner;

//사용자정의 Exception 사용
public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("program start");
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("input numer: ");
		int num = key.nextInt();
		// num이 홀수가 입력되면 예외로 처리 - JVM이 인식하는 예외가 아니지만 예외를 발생시킨다.
		// throw -> 인의적으로 예외를 발생시키는 키워드
		// [문법]
		// throw new 사용자정의예외클래스()
		if (num % 2 == 1) {
			// 예외가 발생된 상황
			try {
				throw new MyException("홀수가 입력됐습니다.(errCode)");
			} catch (Exception e) {
				System.out.println("예외처리완료");// TODO: handle exception
				System.out.println("----------------------");
				System.err.println(e.getMessage());
			}
		} else {
			System.out.println("정상 Step");
		}
	}
}
