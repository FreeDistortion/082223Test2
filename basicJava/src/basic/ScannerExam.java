package basic;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//참조변수의 크기는 4byte라고 생각하는 게 좋음
		
		double kor, mat, eng, total, avrg;
		
		System.out.println("점수기입");
		System.out.print("국어:");
		kor=input.nextDouble();
		System.out.print("수학:");
		mat=input.nextDouble();
		System.out.print("영어:");
		eng=input.nextDouble();
		total=kor+mat+eng;
		avrg=total/3;
		System.out.println("국어: "+kor+"\n수학: "+mat+"\n영어: "+eng+"\n총점: "+total+"\n평균: "+avrg);
		
		
	}

}
