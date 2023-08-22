package statement;

import java.util.Scanner;

//Switch문 연습
//switch
//	if ~else if 대체
//switch문 안에서 평가할 부분
//	변수, 연산식, method호출문...
//switch() 안에서 발생한 값이 case의 값과 일치하면 분기
//정확하게 일치하는 값 비교
//비교연산자는 사용할 수 없다.
//조건에 만족하는 case문부터 계속 실행. 따라서 빠져나오기 위해 break문을 추가해줘야 함
//if 문의 else와 같은 역할을 하는 default문 필요(문법)
public class SwitchTest {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("단: ");
		int dan=key.nextInt();
		switch(dan) {
		case 2:
			System.out.println(dan+"단");
			break;
		case 3:
			System.out.println(dan+"단");
			break;
		default:
			System.out.println("기타");	
		}
	}

}
