package basic;
//기본형 변수에 저장되는 값(literal)

public class PrimitiveTypeValueTest {
	public static void main(String[] args) { 
		int num = 100;
		num = 200;
		
		//논리형 - boolean
		boolean boolVal= false; //or true
		
		//정수형 - byte, short, int, long
		//정수형 리터럴: int
		//byte b = 127;
		//    ---  ---
		//    변수  리터럴
		//  byte(1) int(4)
		byte b = 127;
		//byte b2 = 128; /*error*/
		byte b2 = (byte)1234; //강제로 캐스팅(type 변환)을 하면 저장 가능
		System.out.println("byte변수=>"+b);
		System.out.println("캐스팅된 byte변수=>"+b2);
		short s = 32767;
		System.out.println(s);
		int i = 2147483647; //literal 자체가 int형이기 때문에 해당 값의 오류 표기는 type mismatch가 아님
		//long l = 2147483648;/*long타입의 literal을 사용.(접미사l or L추가)*/
		long l = 2147483648L;
		System.out.println(i);
		System.out.println(l);
		
		//실수형 - double, float
		//실수형 리터럴: double
		double d = 10.5;
		System.out.println(d);
		//float의 접미사 f or F
		float f = 10.5f;
		System.out.println(f);
		
		//문자형 - char
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);//c 변수에 저장된 값을 int로 변환해서 출력해라
		
		//참조형 중 string은 기본형처럼 리터럴로 할당 가능.
		String str = "참조형인 String의 리터럴은 큰따옴표로 기입";
		System.out.println("String변수=> "+str);
	}
}
