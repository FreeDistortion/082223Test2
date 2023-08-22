package basic;

//String class 활용
public class APIExam01 {
	public static void main(String[] args) {
		//1. 안녕하ㅔㅅ요라는 문자열을 입력해 작업
		// string class 만들고 문자열 길이 출력
		String str= new String("안녕하세요");
		int l=str.length();
		System.out.println("길이: "+l);
		
		//String str="안녕하세요";
//		System.out.println("길이: "+str.length());
		
		
		//2. charAt호출해 출력
		char cA=str.charAt(3);
		System.out.println("결과: "+cA);
	}

}
