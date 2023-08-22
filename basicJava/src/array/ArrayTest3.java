package array;
//배열 엑세스
public class ArrayTest3 {

	public static void main(String[] args) {
		//배열 선언 & 생성
		int[] myArr=new int[5];
		
		//배열 초기화
		myArr[0]=20;
		myArr[4]=100;
		
		//배열 요소 개수
		System.out.println("배열 요소 개수: "+myArr.length);
		System.out.println("배열 마지막 index: "+(myArr[myArr.length-1]));
		
		//배열의 access
		//=> index가 제공되므로 for 이용해 access가능.
		
		for(int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("--------------------------");
		for(int i=myArr.length-1;i>=0;i--) {
			System.out.println(myArr[i]);
		}
	}

}
