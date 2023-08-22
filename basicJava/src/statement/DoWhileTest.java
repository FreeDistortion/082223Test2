package statement;

public class DoWhileTest {

	public static void main(String[] args) {
		int i=10;
		//while문은 조건이 만족되지 않으면 블럭 내 코드 실행 안 함.
		while(i<10) {
			System.out.println("while문 처리");
			i++;
		}
		//do~while문은 조건이 만족하지 않앋도 한 번은 블럭 내 코드 실행.
		do{
			System.out.println("while문 처리");
			i++;
		}
		while(i<10);
	}
}
