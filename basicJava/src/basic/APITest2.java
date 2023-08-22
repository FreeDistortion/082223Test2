package basic;

import java.util.Random;

//참조형 변수 사용법
public class APITest2 {

	public static void main(String[] args) {
 		int i =10;
 		System.out.println("기본형변수=> "+i);
		 
		 Random rand=new Random();
		 System.out.println("참조형변수=> "+rand);
		 
		 /*
		  * String class에 정의되어 있는 length 메서드 사용
		  * 1. String class의 기능을 사용하기 위해 메모리에 올림
		  * 2. 메모리에 올라간 String class를 사용하기 위해 동일 타입의 변수를 선언해 할당
		  * 3. .을 이용해 heap에 할당된 String을 찾아가서 필요한 기능을 참조해서 사용
		  *    --------
		  *    method 호출
		  * 4. method 실행 결과가 있으면 결과와 동일한 타입의 변수를 선언해서 method의 실행 결과를 저장해서 활용.
		  *    -------------			---------
		  *    return value				return type
		  * 5. 매개변수를 확인하고 알맞은 값을 넣어서 호출.
		  */
		 String str = new String("java programming");
		 //method의 호출 결과가 있는 경우, 같은 타입의 변수를 선언해 저장해야 함.
		 int result = str.length();//length method 호출
		 System.out.println("결과=> "+result);
		 String result2 = str.toUpperCase();
		 System.out.println("결과=> "+result2);
		 
	}
}
