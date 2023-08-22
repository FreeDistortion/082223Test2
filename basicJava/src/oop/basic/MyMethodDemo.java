package oop.basic;

import java.util.Scanner;

public class MyMethodDemo {
	//2. calcArr
	//	variable -> int배열(필요하면 다른 것도 추가 가능)
	//	return val -> void
	public void calcArr(int[] intArr,String str) {
		int oddHap = 0;
		int evenHap = 0;
		for(int i=0;i<intArr.length;i++) {
			if(intArr[i]%2==0){
				evenHap = evenHap + intArr[i];
			}else{
				oddHap = oddHap +intArr[i];
			}
		}
		System.out.println("(배열"+str+")");
		System.out.println("홀수의합:"+oddHap);
		System.out.println("짝수의합:"+evenHap);
	}
	
	//1. calc method 추가
	//	consider 3 variables(opr, num1, num2), return value & type
	public double calc(int opr, double num1, double num2) {
		double result = 0;
		if(opr==1) {
        	result = num1+num2;
        }else if(opr==2) {
        	result = num1-num2;
        }else if(opr==3) {
        	result = num1*num2;
        }else if(opr==4) {
        	result = num1/num2;
        }
		return result;
	}
	
	public void printGuGu(int countVal) {
		System.out.print("단 입력: ");
		Scanner key=new Scanner(System.in);
			for(int i=1;i<=countVal;i++)
			{
				System.out.println(countVal+"*"+i+"="+(countVal*i));
			}
	}
	
	public void printGuGu() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
}
