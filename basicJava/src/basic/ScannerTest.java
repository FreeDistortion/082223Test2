package basic;

import java.util.Scanner;

//scanner 사용방법
//키보드를 통해 입력받은 값을 타입에 따라 읽어서 사용할 수 있도록 지원
//표준 입력으로 입력된 값을 일어 return하는 기능 제공
//------
//키보드로 입력: System.in(Console.ReadLine이랑 비슷한 듯)
//표준출력(모니터로 출력, console로 출력): System.out
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.print("문장 입력:");
		String line=key.nextLine();//nextLine()은 한 문장을 읽음
		System.out.println(line);
		
		//Scanner를 이용하면 키보드로 입력하는 값을 읽울 수 있음
		
		System.out.print("문자열 입력:");
		String val1= key.next();//next()는 spacebar나 enter를 만나기 전까지 입력된 문자열 리턴
		System.out.println("input val1: "+val1);
		
		System.out.print("정수 입력:");
		int val2=key.nextInt();
		System.out.println("input val1: "+val2);
		
		System.out.print("실수 입력:");
		double val3= key.nextDouble();
		System.out.println("input val1: "+val3);
	}
}
