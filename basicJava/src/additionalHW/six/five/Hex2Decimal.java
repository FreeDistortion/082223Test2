package additionalHW.six.five;

import java.util.Scanner;


public class Hex2Decimal {

	/* 이곳에 프로그램을 작성하십시오. */

	static String inputVal;

	public static void run() {
		inputVal = null;
		System.out.print("Enter the hex value ('quit' for exit) : ");

		Scanner key = new Scanner(System.in);
		inputVal = key.nextLine();
		try {
		int trNum = translate(inputVal);
		display(trNum);}
		catch (Exception e) {
			// TODO: handle exception
			run();
		}

	}

	public static void display(int val) {
		System.out.println("hex input : " + inputVal);
		System.out.println("decimal output : " + val);
	}

	public static int translate(String str) throws NumberFormatException{
		int calculatedNum = 0;
		if (str.equals("quit")) {
			System.out.println("Bye !!!");
			System.exit(0);
		}
		
		else {
			String[] strArr = str.split("");
			int indexRange = strArr.length;

			for (int indexNo = 0; indexNo < indexRange; indexNo++) {
				Integer numAtIN = 0;

//				if (Integer.valueOf(strArr[indexNo]) instanceof Integer) {
//				numAtIN=Integer.valueOf(strArr[indexNo]);
//				calculatedNum += (numAtIN * Math.pow(16, (indexRange - (indexNo + 1))));
//			}
				try {
					numAtIN = Integer.valueOf(strArr[indexNo]);
					calculatedNum += (numAtIN * Math.pow(16, (indexRange - (indexNo + 1))));

				} catch (NumberFormatException e) {
					switch (strArr[indexNo]) {
					case "A": {
						numAtIN = 10;
						break;
					}
					case "B": {
						numAtIN = 11;
						break;
					}
					case "C": {
						numAtIN = 12;
						break;
					}
					case "D": {
						numAtIN = 13;
						break;
					}
					case "E": {
						numAtIN = 14;
						break;
					}
					case "F": {
						numAtIN = 15;
						break;
					}
					default:
						System.out.println("Invalid hex!!!\n===========================================================");
						throw new NullPointerException();
					}
					calculatedNum += (numAtIN * Math.pow(16, (indexRange - (indexNo + 1))));
				}
			}
			
			
		}
		
		
		return calculatedNum;

	}

	public static void main(String[] args) {
		try {
			run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
