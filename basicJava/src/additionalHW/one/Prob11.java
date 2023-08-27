package additionalHW;

public class Prob11 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 15;
		System.out.println("두 수의 차는 : " + abs(num1, num2));
	}

	private static int abs(int num1, int num2) {
		// 구현하시오.
		int result=0;
		if(num2-num1>0) {
			result=num2-num1;
		}else {
			result=-(num2-num1);
		}
		return result;
	}
}
