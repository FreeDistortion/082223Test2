package array;
//2차원 배열의 선언, 생성, 초기화 동시 작업
public class Array2DTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원 배열
		//	int[] a={};
		
		//2치원 배열
		int[][] scoreArr= {
				{90,89,100},
				{90,89,97}
		};
		
		for(int i=0;i<scoreArr.length;i++)
		{
			int sum=0;
			for(int j=0;j<scoreArr[i].length;j++)
			{
				System.out.print(" "+scoreArr[i][j]);
				sum+=scoreArr[i][j];
			}
			System.out.println("\t합계: "+sum+" 평균: "+(sum/scoreArr[i].length));
			System.out.println();
		}
	}

}
