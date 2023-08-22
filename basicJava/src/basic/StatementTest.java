package basic;

public class StatementTest {
	public static void main(String[] args) {
		//variable: java는 data type을 명시하고 변수를 선언해야 함.
		/*
		 * dataType variable = value;
		 */
		int num1 = 100;//define variable
		int num2;//변수정의
		num2 = 200;//정의된 변수에 값 할당
		//이미 정의된 변수를 dataType과 함께 정의하면 새 변수를 만들겠다는 뜻.
		//이 때 기존에 정의된 이름과 동일한 이름으로 변수 정의 시 error
		System.out.println("num1="+num1);
		System.out.println("num2의 값=>"+num2);
		//연산자(산술연산자) -, +, -, /, *, %
		int result =num1+num2;
		System.out.println("+연산 결과=>"+result);
		
		result=num2-num1;
		System.out.println("-연산 결과=>"+result);
		result=num2*num1;
		System.out.println("*연산 결과=>"+result);
		
		result=num1/3;
		System.out.println("/연산 결과=>"+result);
		result=num1%3;
		System.out.println("%연산 결과=>"+result);
	}
}
