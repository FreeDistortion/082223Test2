package basic;
//Java에서 local 변수의 특징
public class LocalVariableTest {
	int i; //this isn't local variable but member variable(field variable)
	public static void main(String[] args) {
		int j=10;//this is local variable, main block에서 정의된 var
		int num;
		//1. 로컬변수는 사용 전에 초기화(=연산자로 값 할당) 필요
		if(j>=10) {
			int val = 100;// local var, if block에서 정의된 var
			System.out.println("j="+j);
			System.out.println("val="+val);
		}
		//2. 로컬변수는 선언된 block 내에서만 유효
		
		//System.out.println("val="+val);
		//block밖에선 메모리에서 할당 해제
	}
}
