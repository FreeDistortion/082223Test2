package array;
//2차원 배열 정의 및 access - 이중참조 배열(다차원배열, 배열을 참조하는 배열)
public class Array2DTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형 데이터 2개가 저장될 수 있는 배열을 참조하는 배열
		int[][] myArr=new int[3][2];
		myArr[0][0]=100;
		myArr[1][0]=100;
		myArr[2][0]=100;
		
		System.out.println(myArr[0][1]);
		System.out.println("배열의 길이->"+myArr.length);
		for(int i=0;i<3;i++) {
			System.out.println("myArr["+i+"] 배열이 참조하는 배열의 길이->"+myArr[i].length);
		}
		
		for(int j=0;j<3;j++) {
			for(int i=0;i<2;i++) {
				System.out.print(myArr[j][i]+"\t");
			}
			System.out.println();
		}
		
		//끄적인거
		/*
		 * int[][][] tempArr=new int[3][3][3]; for(int k=0;k<3;k++) { for(int
		 * j=0;j<3;j++) { for(int i=0;i<3;i++) { System.out.print(tempArr[k][j][i]); }
		 * System.out.print("\t"); } System.out.print("\t"); }
		 */
	}

}
