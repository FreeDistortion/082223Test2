package additionalHW.one;



public class Prob4 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		int len=sourceString.length();
		for(int i=0;i<len;i++)
		{
			switch(sourceString.charAt(i)) {
			case 'x':
				encodedString+='a';break;
			case 'y':
				encodedString+='b';break;
			case 'z':
				encodedString+='c';break;
			case ' ':
				encodedString+=' ';break;
			default:			
				encodedString+=(char)(sourceString.charAt(i)+3);
			}
		}
		
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
	}

}
