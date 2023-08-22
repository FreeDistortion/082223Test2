package statement;

import java.util.Scanner;

//if문 중첩
//0~59:F, 등차10 간격으로 학점 부여, 110~-40:오기
//출력형식은 다음과 같다.
//점수:__, __학점
//scanner입력
//
public class MultiIfExam {

	public static void main(String[] args) {
		System.out.print("점수 기입: ");
		Scanner inputData =new Scanner(System.in);
		int score=inputData.nextInt();
		if(score>100|score<0) {
			System.out.println("오기");
		}else if(score<60&score>=0) {
			System.out.println("점수: "+score+", 학점: F");
		}else if(score<70&score>60) {
			System.out.println("점수: "+score+", 학점: D");
		}else if(score<80&score>70) {
			System.out.println("점수: "+score+", 학점: C");
		}else if(score<90&score>80) {
			System.out.println("점수: "+score+", 학점: B");
		}else{
			System.out.println("점수: "+score+", 학점: A");
		}
		/*
		 * if(score>100|score<0) { System.out.println("오기"); }else if(score<60)
		 * { System.out.println("점수: "+score+"학점: F"); }else if(score<70) {
		 * System.out.println("점수: "+score+"학점: D"); }else if(score<80) {
		 * System.out.println("점수: "+score+"학점: C"); }else if(score<90) {
		 * System.out.println("점수: "+score+"학점: B"); }else{
		 * System.out.println("점수: "+score+", 학점: A"); }
		 */
	}

}
