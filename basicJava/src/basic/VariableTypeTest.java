package basic;

//기본형과 참조형 기뵤
public class VariableTypeTest {
	public static void main(String[] args) {
		//기본형변수
		int i=10; int j=10;
		System.out.println("--------기본형--------");		
		if(i==j) {
			System.out.println("기본형 같다.");
		}
		else {
			System.out.println("기본형 다르다.");
		}
		
		System.out.println("--------참조형--------");		
		String str= new String("Java");
		String str2= new String("Java");
		if(str==str2) {
			System.out.println("참조형 같다.");
		}
		else {
			System.out.println("참조형 다르다.");
		}
		
		System.out.println("--------참조형--------");		
		String strA= "Java";
		String strB= "Java";
		if(strA==strB) {
			System.out.println("참조형 같다.");
		}
		else {
			System.out.println("참조형 다르다.");
		}
		
		System.out.println("--------문자열비교--------");		
		if(str.equals(str2)) {
			System.out.println("문자열 같다.");
		}else {
			System.out.println("문자열 다르다.");
		}
		
	}

}
