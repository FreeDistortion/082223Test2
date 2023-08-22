package basic;
//논리연산자 &&, ||
public class OprTest4 {
	public static void main(String[] args) {
		int num1=200;
		String str=null;//null: 참조형 변수의 초기값
//		str.length();
//		System.out.println(num1>100 | str.length()>0);
		System.out.println(num1>100 || str.length()>0);
//		System.out.println(num1<100 || str.length()>0);
		// ||연산자는 OR 연산자의 첫 번째 항이 true면 true 리턴
		
		//&&
//		System.out.println(num1<100 & str.length()>0);
		System.out.println(num1<100 && str.length()>0);
		
	}

}
