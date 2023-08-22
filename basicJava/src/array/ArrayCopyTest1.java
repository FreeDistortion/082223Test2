package array;
//배열의 사이즈를 변경하는 작업 - 코드로 구현
public class ArrayCopyTest1 {

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
		//2.	기존 배열의 요소를 새 배열에 copy
		for(int i=0;i<firstArr.length;i++) {
			secArr[i]=firstArr[i];
		}
		for(int i=0;i<secArr.length;i++) {
			System.out.print(secArr[i]+"\t");
		}
		
		
	}

}
