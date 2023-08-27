package additionalHW;


import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		
		int inputInt = 1;
		try {
			inputInt = keyboard.nextInt();
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}
		
		//프로그램을 구현하세요.
		if(inputInt>=2|inputInt<=9) {
			int facCalc=1;
			for(int i = 1; i<=inputInt;i++) {
				
				facCalc*=i;
				System.out.println(i+" ! = "+facCalc);

			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다");
		}
		
	}
}
