package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch 이용
//예외처리: try~catch~catch...
//->	각각의 예외가 발생할 때마다 다르게 처리하고 싶은 경우 catch block을 여러 개 선언해서 사용 가능.
class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		String str=null;
		try {
			//예외 발생 가능성이 있는 코드
			System.out.println("start");
			System.out.println("input number");
			int num1=key.nextInt();
			System.out.println("intput divide number: ");
			int num2=key.nextInt();
			System.out.println("result -> "+(num1/num2));
			System.out.println(str.length());
			System.out.println("end");
		
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("can't divide 0");
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("don't input Alphabet");
		}catch (Exception e) {
			System.out.println("unexpectable err occur");// TODO: handle exception
		}
	}
}
