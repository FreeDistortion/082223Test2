package exception;

//try~catch~finally
//->	예외가 발생하던 안 하던 반드시 실행해야 한는 코드를 정의해야 하는 경우 finally block 안에 정의
//->	자원 반납
public class ExceptionTest05 {

	public static void main(String[] args) {
		try {// TODO Auto-generated method stub
			System.out.println("program start");
			System.out.println("DB connecting");
			System.out.println("DB handling..." + 10 / 0);
			System.out.println("finished");
//		System.out.println("자원반납코드");
		} catch (Exception e) {
			System.out.println("err code check");
//			System.out.println("자원반납코드");// TODO: handle exception
		} finally {
			// 예외가 발생하든 안하든 무조건 실행
			System.out.println("무조건 실행되는 코드 ----------- 자원반납");
		}
	}

}
