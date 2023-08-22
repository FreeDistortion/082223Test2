package array;
//배열의 사용
/*
 * 1. 배열 선언
 * 2. 배열 생성
 * 3. 배열 초기
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] myArr;
		//1. 배열 선언: 배열을 참조할 변수를 정의하는 과정
		//형식은 다음과 같다.
		//type[] variable
		//myArr은 int 배열을 참조하는 변수
		myArr=null;// 참조형인데 main 안에 있는 local var이므로 초기화 필요
		System.out.println(myArr);
		
		myArr=new int[5];
		//2. 배열 생성: 실제 데이터를 저장할 수 있는 구조 생성 과정
		//									 ----
		//								생성된 배열은 heap에 할당.
		//heap에 할당되므로 사용을 위해선 정의된 배열참조변수(myArr)에 대입한다.
		//int 데이터가 5개 저장될 수 있는 배열 생성(5개의 요소를 갖고있는 배열 생성)
		System.out.println(myArr);
		
		int[] myArr2= new int[2];
		System.out.println(myArr2);
		//배열의 선언과 생성 동시에 작업
		
		System.out.println(myArr[0]+", "+myArr2[2]);
		//배열 요소의 초기값 출력
	}

}