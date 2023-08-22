package array;

import java.util.Random;

//배열의 사용: 배열을 만들고 초기값 살펴보기
public class ArrayTest2 {
	public static void main(String[] args) {
		//1. 배열의 선언 & 생성
		int[] myArr=new int[3];
		double[] myArr2=new double[3];
		boolean[] myArr3=new boolean[3];
		String[] myArr4=new String[4];
		Random[] myArr5=new Random[3];
		//배열은 각 요소에 초기값이 자동 할당
		/*
		 * int(정수): 0
		 * double(실수): 0.0
		 * boolean(논리): false
		 * 참조형: null
		 */
		System.out.println(myArr[0]);
		System.out.println(myArr2[0]);
		System.out.println(myArr3[0]);
		System.out.println(myArr4[0]);
		System.out.println(myArr5[0]);
		
		
		//2. 배열 초기화
		//	=> 배열의 각 요소에 값 할당
		myArr[0]=100;
		myArr[1]=200;
		myArr[2]=300;
		System.out.println(myArr[0]+"\n"+myArr[1]+"\n"+myArr[2]+"\n");
		System.out.println(myArr[3]);
	}

}
