package basic;

public class TimeTest {
	public static void main(String[] args) {
//		TimeTest.java작성,
//			int 변수 선언 후 8800할당
//			8800초 가정, 시 분 초 표현
//			문제 풀이에 필요한 변수는 알아서
//		출력형식은 다음과 같음
//			_시간_분_초
		int totalTime, timeSec, timeMin, timeHr;
		totalTime=8800;
		timeHr=totalTime/(3600);
		timeMin=(totalTime-(3600)*timeHr)/60;//totalTime/60%60;
		timeSec=totalTime-((3600)*timeHr+60*timeMin);//totalTime%60;
		/*
		 * tempData=totalTime%3600;
		 * min=tempData/60;
		 * sec=tempData%60;
		 */
		System.out.print(+timeHr+"시간 "+timeMin+"분 "+timeSec+"초");
	}
}
