package additionalHW;

import java.util.Scanner;

public class Prob9 {
 
	public static void main(String[] args) {
		int number; 

		Scanner keyboard = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. : ");
		number = keyboard.nextInt();

		//프로그램을 구현하세요.
		for(int i = number;i>=1;i--) {
			for(int j = i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
