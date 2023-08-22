package array;

public class ArrayExam1 {

	public static void main(String[] args) {
		//1. int형 데이터가 저장될 배열 생성 및 작업: 5개 요소, 각 100~500까지 100단위 할당
		//2. 출력
		int[] iArr= new int[5];
		for(int i=0;i<iArr.length;i++){
			iArr[i]=(i+1)*100;
			System.out.println(iArr[i]);
		}
	}

}