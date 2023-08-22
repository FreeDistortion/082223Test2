package array;

import java.util.Random;

//배열 연습
/*
 * 1~100까지 랜덤 수가 배열에 저장, 인덱스=5
 * 배열에 저장된 데이터를 액세스해서 출력
 * 출력 형식은 다음과 같다.
 * 0번 요소 -> __ (홀/짝)
 * ~
 * 4번 요소 -> __ (홀/짝)
 */
public class ArrayExam {

	public static void main(String[] args) {
		int[] randArr=new int[5];
		Random rand=new Random();
		for(int i=0;i<randArr.length;i++)
		{
			randArr[i]=rand.nextInt(100)+1;
			if(randArr[i]%2==0)
			{
				System.out.println(i+"번 요소 => "+randArr[i]+"(짝수)");
			}
			else
				System.out.println(i+"번 요소 => "+randArr[i]+"(홀수)");
		}
//=================================================================
//=================================================================
		for(int i=0;i<randArr.length;i++)
		{
			randArr[i]=rand.nextInt(1,101);
		}
		for(int i=0;i<randArr.length;i++)
		{
			if(randArr[i]%2==0)
			{
				System.out.println(i+"번 요소 => "+randArr[i]+"(짝수)");
			}
			else
				System.out.println(i+"번 요소 => "+randArr[i]+"(홀수)");
		}
		
		
	}

}
