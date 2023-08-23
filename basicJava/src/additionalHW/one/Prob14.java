package additionalHW.one;


public class Prob14 {
	public static void main(String[] args) {
		int year = 2104;
		int month = 2;
		int maxDay;

		/* 이 부분을 작성하세요 */
		switch (month) {
			case 1,3,5,7,8,10,12:
				maxDay=31;break;
			case 4,6,9,11:
				maxDay=30;break;
		default:
			maxDay=28;
		}
		
		if (year % 100 == 0 & year % 400 == 0) {
			maxDay = 29;
		} else if (year % 4 == 0 & year % 100 != 0) {
			maxDay = 29;
		} else {
			if (year % 4 == 0) {
				maxDay = 29;
			}
			maxDay = 28;
		}

		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다");
	}
}
