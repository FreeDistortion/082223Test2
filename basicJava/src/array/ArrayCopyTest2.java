package array;
//배열의 사이즈를 변경하는 작업 - arraycopy method를 이용
public class ArrayCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArr=new int[5];
//		배열의 값을 할당하는 작업
		
		for(int i=0;i<firstArr.length;i++) {
			firstArr[i]=10+i;
		}
		for(int i=0;i<firstArr.length;i++) {
			System.out.print(firstArr[i]+"\t");
		}
		System.out.println();
		
		//배열 사이즈 변경법
		//1.	배열 사이즈 변경을 위해 새 배열을 만들어야 함.
		int[] secArr=new int[firstArr.length*3];
		//2.	기존 배열의 요소를 새 배열에 copy하도록 지원되는 System class의 arraycopy method 이용
		//		System.arraycopy(firstArr,0,secondArr,0,0);
		//						--------- - --------- - -
		//				copy할 원본 배열	  ^	 타겟 배열	  ^	copy할 요소의 개수
		//								  |			  |
		//								시작 위치		타겟 배열 시작 위치

		//오... 신기하다
		System.arraycopy(firstArr, 0, secArr, 0, firstArr.length);
		for(int i=0;i<secArr.length;i++) {
			System.out.print(secArr[i]+"\t");
		}
				
	}

}
