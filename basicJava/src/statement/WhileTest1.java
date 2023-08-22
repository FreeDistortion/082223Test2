package statement;
//while문 기본 사용법
public class WhileTest1 {
	public static void main(String[] args) {
		//while문은 실행 결과가 t/f인 method 호출 or 비교연산자로 작업
		//while문의 () 안에서 method호출문이나 연산식을 이용해 t/f반왼되도록 적용
		//1~10출력
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("=========================");
		i=1;
		while(true){
			System.out.println("Java Program: "+i);
			if(i==5) {break;}
			i++;
		}
	}
}
