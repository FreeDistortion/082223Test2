package statement;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		System.out.print("점수 기입: ");
		Scanner inputData =new Scanner(System.in);
		int score=inputData.nextInt();
		if(score<=100|score>=0) {
			//switch문 활용해서 A~F평가
			int val=score/10;
			switch(val) {
			case 9: case 10:
				System.out.println("점수: "+score+" ,학점: A");
				break;
			case 8:
				System.out.println("점수: "+score+" ,학점: B");
				break;
			case 7:
				System.out.println("점수: "+score+" ,학점: C");
				break;
			case 6:
				System.out.println("점수: "+score+" ,학점: D");
				break;
			default:
				System.out.println("점수: "+score+" ,학점: F");
			}
		}else{
			System.out.println("오기");
		}
	}

}
