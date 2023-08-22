package array;

import java.util.Random;

//참조형배열
//-> 기본형배열은 배열의 요소에 각각 값이 저장.
//-> 참조형배열은 배열의 요소에 각각 주소가 저장.
//-> 참조형배열은 배열의 요소에 null로 초기화.
public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr=new String[3];
		Random[] randArr=new Random[3];
		
		randArr[0]=new Random();
		randArr[1]=new Random();
		randArr[2]=new Random();
		
		//참조형 변수는 출력시 reference가 나옴
		for (int i=0; i<randArr.length;i++) {
			System.out.println(randArr[i]);
		}
		
		//String배열
		strArr[0]=new String("java");
		strArr[1]=new String("oracle");
		strArr[2]=new String("jdbc");
		
		for (int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		//String배열 - 참조형 배열도 선언, 생성과 초기화를 한번에 작업 가능
		String[] strArr2= {"java","oracle","jdbc"};
		Random[] randArr2= {new Random(),new Random(),new Random()};
		
		//향상된 for문 - 자료구조에 저장된 데이터를 편하게 access하기 위해 사용
		/*
		 * 문법은 다음과 같다.
		 * for(데이터타입 변수: 배열변수){
		 * 	  --------
		 * 		배열의 요소에 할당될 데이터 또는 객체의 타입
		 * }
		 */
		int[] intArr=new int[10];
		for (int data:intArr) {
			System.out.println(data);
		}
		System.out.println("====================");
		for (String data:strArr2) {
			System.out.println(data);
		}
		
		
	}

}
