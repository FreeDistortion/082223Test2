package basic;

public class OprTest2 {
//비교연산자
	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int num3=200;
		//num1이 +연산자 앞의 값이 String이므로 String화 됨.
		//+연산자는 +와 연결연산자의 역할을 함.
		//+연산자의 첫 번째 항이 문자열이면 문자열로 모두 변환됨.
		System.out.println("더한 결과=> "+(num1+num2+num3));
		System.out.println("num1>num2=>"+(num1>num2));
		System.out.println("num1>=num2=>"+(num1>=num2));
		System.out.println("num1<num2=>"+(num1<num2));
		System.out.println("num1<=num2=>"+(num1<=num2));
		
		System.out.println("num1==num3=>"+(num1==num3));
		System.out.println("num2==num3=>"+(num2==num3));
		System.out.println("num1!=num3=>"+(num1!=num3));
		
	}

}
