package HW;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int doesPrime=0;
		Scanner key=new Scanner(System.in);
		System.out.print("2 ~ 100 사이의 정수를 입력하세요.: ");
		doesPrime=key.nextInt();
		int primeBool=0;
		if(doesPrime>=2&doesPrime<=100) {
			for (int i=2;i<doesPrime;i++) {
				if(doesPrime%i==0) {
					primeBool++;
				}
			}
			if(primeBool==0) {System.out.println("소수입니다.");
			}
			else {System.out.println("소수가 아닙니다.");}
		} 
		else{
		System.out.print("알맞은 정수를 입력하세요.");

		}
	}

}
