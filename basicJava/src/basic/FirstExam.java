package basic;

public class FirstExam {
	public static void main(String[] args) {
		//국영수 점수 임의 정의 및 총점과 평균 출렵, 출력 형식은 다음과 같음
		//총점:
		//평균:
		int kor, eng, math;
		kor=50;eng=60;math=70;
		int total=kor+eng+math;
		int avrg=total/3;
		System.out.println("총점: "+total);
		System.out.println("평균: "+avrg);
	}
}
