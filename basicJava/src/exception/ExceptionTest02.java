package exception;
//java에서 예외처리를 하는 방법: try~catch
public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try block start");
			System.out.println(10/0);
			System.out.println("try block end");
		}catch(ArithmeticException e) {
			//예외가 발생하면 처리할 문장 구현
			//exception이 발생하지 않으면 catch block은 실행X
			System.out.println("예외발생");
			System.out.println("예외 메시지 -> "+e.getMessage());
			//예외를 추적해서 화면에 라인 넘버까지 출력하므로 개발시에 많이 사용.
			e.printStackTrace();
		}
	}
}
