package array;
/*
 * 명령행매개변수
 * ->	프로그램이 실행될 때 외부에서 값을 입력받아서 사용할 수 있도록 지원
 * ->	프로그램을 실행하면서 값을 입력하면 인터프리터가 클래스명 다음에 몇 개를
 * 		입력했는지 확인하고(space bar를 기준으로 파악)
 * 		그 개수만큼 String 배열로 만들어 관리
 * 
 * 		[command창에서 실행하는 경우]
 * 		java 클래스명 매개변수1 매개변수2...
 * 
 * 		ex)
 * 		c:\>java ArgsTest java oracle
 * 		
 * 		String[] args= new String[2];
 * 		args[0] = "java";
 * 		args[1] = "oracle";
 * 
 * 		String[] args = {};
 */
public class ArgsTest {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//숫자 모양인 문자열의 데이터타입을 int형으로 뱐환해서 리턴하는 method인 Integer.parseInt를 이용해 숫자로 변경
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(args.length);
		System.out.println(num1+num2);
		
		//1. 	(새로운 파일에서 작업) 명령행 매개변수 숫자 5개 입력받아 숫자로 놀 수 있는 거 하기
		//2. 	(새로운 파일에서 작업) 문자열 입력받고, 입력받은 문자열 거꾸로 출력
		//		입력: java
		//		출력: avaj
		
		//run configurations -> class 선택 -> argument -> prompt argument -> variable -> string_prompt
	}

}
