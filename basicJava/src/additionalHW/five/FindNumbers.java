package additionalHW.five;

import java.lang.reflect.Array;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn = new FindNumbers();

		long number = 228754462;
		System.out.println("입력 숫자 = " + number);
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));// 3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));// 2를 리턴
	}

	/* 이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber(long number, int compareNum) {
		String strCast = number + "";
		int c = 0;
//		for(int i=0;i<strCast.length();i++) {
//			if (strCast.in(i) == compareNum) {
//				c++;
//			}
//		}
		for (int i = 0; i < strCast.length(); i++) {
			if ((strCast.charAt(i)-'0') == compareNum) {
				c++;
			}
		}
		return c;
	}
}
