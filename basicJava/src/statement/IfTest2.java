package statement;

import java.util.Scanner;

//if~else제어구문
public class IfTest2 {

	public static void main(String[] args) {
		//점수 입력 scanner로 받아서 90점 이상 pass, 나머지 fail
		//단, 점수가 0보다 작거나 100보다 큰 값을 입력받으면 "잘못입력"
		System.out.print("score: ");
		Scanner input= new Scanner(System.in);
		double score=input.nextDouble();
		if(score<0|score>100) {
			System.out.println("error");
		}	
		else {
			if (score>=90) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}
		//======================
		if(score>=0&score<=100)
		{
			if (score>=90) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}
		else
		{
			System.out.println("error");
		}
		
		
		
	}

}
