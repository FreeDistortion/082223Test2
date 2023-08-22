package array;
//배열 선언 생성 초기화 동시 작업
public class ArrayTest4 {
	public static void main(String[] args) {
		//타 언어에서 사용하는 방법으로 ,로 구분
		int[] myArr= {1,2,3,4,5};
		for(int i=0;i<myArr.length;i++){
			System.out.println(myArr[i]);
		}
		
		//Java st.
		int[] myArr2 = new int[] {1,2,3,4,5};
		for(int i=0;i<myArr.length;i++){
			System.out.println(myArr[i]);
		}
	}

}
