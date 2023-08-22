package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//프로그램 실핼 중 예외가 발생하는 상황

class Super {

}

class Sub extends Super {

}

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 개발자가 실수할 수 있는 부분
		System.out.println("********프로그램 시작********");
//		System.out.println(10/0);/ArithmeticException
//		System.out.println(args[0]);//ArrayIndexOutOfBoundsException
		String str = null;
//		str.length();//NullPointerException
		Super obj = new Super();
//		Sub obj2=Sub(Sub)obj;//ClassCastException
		System.out.println("==========================");

		// 2. 외부 요인이나 사용자의 실수로 발생할 수 있는 Exception
		Scanner key = new Scanner(System.in);
		System.out.println("input value: ");
		int data = key.nextInt();
		System.out.println("user input value -> " + data);// InputMismatchException

		// 3. API에서 문법저긍로 예외처리를 컴파일타임에 요구하는 경우
		// -> method 선언부에 XXXException을 throws하는 것은 이 method를 사용하면서 XXXException이 발생할 수
		// 있다는 의미
		// -> Exception에 대한 처리를 runtimeException의 하위는 문법적으로 제약하지 않는다.
		// -> runtimeException의 하위 exception이 아닌 경우 compile 시점에서 예외처리를 해주어야 한다.
		// -> runtimeException의 하위이든 아니든 예외 발생 가능성이 있는 코드이므로 무조건 예외처리를 해주어야 한다.

		try {
			//예외가 발생할 가능성이 있는 method를 호출 - 호출하는 곳에서 예외처리
			FileReader f = new FileReader("test2.txt");// FileNotFoundException <- runtime exception이 상위에 없음.
			System.out.println((char) f.read());
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로가 틀림");// TODO: handle exception
			System.out.println("다시선택");
		} catch (IOException e) {
			System.out.println("파일읽기오류발생");// TODO: handle exception
		}
		Integer.parseInt("1234");// NumberFormatException <- runtime exception이 상위에 있음.

	}

}
