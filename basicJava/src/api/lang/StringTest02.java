package api.lang;

//String 객체의 비교
// -	리터럴로 생성(상수풀)
// -	new 연산자를 이용해서 생성
public class StringTest02 {

	public static void main(String[] args) {
		// 리터럴로 할당되는 String 객체와 new 연산자로 생성되는 String객체는 다른 memory에 할당.
		// 리터럴의 형태로 할당되는 String은 상수풀에 저장되며 문자열이 같은 경우, 두 번 생성되지 않고 같은 객체로 인식.
		// new 연산자를 이용해서 생성하는 경우 무조건 새로 생성
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		if (str1 == str2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("-----------------------------------");

		if (str3 == str4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("-----------------------------------");

		if (str1 == str4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}

}
