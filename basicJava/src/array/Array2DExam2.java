package array;
//2차원 배열의 활용 예제
public class Array2DExam2 {

	public static void main(String[] args) {
		//	1.	2개 학급의 국수영 점수를 저장할 배열 만들고 값 저장
		//		A반: 90, 89, 100
		//		B반: 98, 89, 97
		//		점수는 각각 코드로 저장.
		
		//	2.	저장된 배열의 모든 값 출력
		//		단, 각 과목 점수 출력 뒤에 전체합, 평균 출력
		//		90 89 100	합계:__ 평균:__
		//		98 89 97	합계:__ 평균:__
		
		int[][] scoreArr=new int[2][3];
		scoreArr[0][0]=90;
		scoreArr[0][1]=89;
		scoreArr[0][2]=100;
		scoreArr[1][0]=90;
		scoreArr[1][1]=89;
		scoreArr[1][2]=97;
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
