package exception;

import java.util.Scanner;

//while문 사용과 exception처리
public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		//while문을 사용하는 경우, while 밖에서 예외처리를 정의하면 예외가 발생하는 경우 반복문이 모두 실행되지 않고 프로그램이 종료됨.
//		try {
//			//예외 발생 코드
//			int i=10;
//			while(i<=13) {
//				System.out.println("나누기 할 숫자: ");
//				int num= key.nextInt();
//				System.out.println("값 -> "+i/num);
//				i++;
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//			
//		}
		
		//while무 안에서 예외처를 정의하면 반복문이 모두 실행된다.
		//예외가 발생하는 경우만 catch block이 실행
		int i=10;
		while(i<=13) {
			System.out.println("나누기 할 숫자: ");
			int num= key.nextInt();
			try {
			System.out.println("값 -> "+i/num);
			}catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.err");
			}
			i++;
		}
		
	}

}
