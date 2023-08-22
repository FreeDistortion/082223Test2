package basic;

import java.util.Random;

public class APIExam02 {
	public static void main(String[] args) {
		//1. java.util package의 random class를 이용해 작업
		//	참조 변수명: rand
		//	nextInt method를 호출해 랜덤 수를 다음과 같이 출력
		//	출력형식은 다음과 같다.
		//	 랜덤수: 
		
		//2. 1.을 완료하면 메일 제출, 1~100까지의 랜덤수 출력 가능하게 random class에서 method 찾아서 호출
		//	출력형식은 다음과 같다.
		//	 랜덤수:
		Random rand=new Random();
		System.out.println("랜덤수: "+rand.nextInt());
		
		int r = rand.nextInt(100)+1;
		System.out.println("랜덤수: "+r);
		/*
		 *	System.out.println("랜덤수: "+rand2.nextInt(100)+1); << 이런 식으로 표현할 수는 없을까? 
		 */
	}

}
