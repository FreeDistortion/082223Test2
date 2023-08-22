package oop.basic;

import java.util.Scanner;

public class OOPForExam_GuGu {

	public static void main(String[] args) {
		System.out.print("단 입력: ");
		Scanner key=new Scanner(System.in);
		int tVal=key.nextInt();
		MyMethodDemo demo= new MyMethodDemo();
		demo.printGuGu(tVal);
	}

}
