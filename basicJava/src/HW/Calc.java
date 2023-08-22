package HW;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner calKey, num1Key, num2Key;
		int calOp;
		double num1, num2;
		double calOut=0;
		System.out.println("*******미니계산기********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		calKey=new Scanner(System.in); calOp=calKey.nextInt();
		System.out.println("숫자를 입력하세요.");
		num1Key=new Scanner(System.in); num1=num1Key.nextDouble();
		num2Key=new Scanner(System.in); num2=num2Key.nextDouble();
		if(calOp==1) {calOut=num1+num2;}
		else if(calOp==2) {calOut=num1*num2;}
		else if(calOp==3) {calOut=num1-num2;}
		else if(calOp==4) {calOut=num1/num2;}
		else {System.out.println("올바른 연산자를 선택하세요.");}
		System.out.println("계산 결과=> "+calOut);
	}
}
