package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//throws를 이용해서 예외를 처리
//->	예외가 직접적으로 방생한 곳에서 처리하지 않고 이 method를 호출하는 곳에서 예외를 처리하도록 구현
public class ThrowsTest01 {
	// 1. 예외가 발생한 곳에서 처리하기
	public void test(String filename) {
		try {
			FileReader fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println("에외처리 완료");

		}
	}

	// 2. 예외가 발생한 곳에서 처리하지 않고 호출한 곳에서 예외를 처리하도록 예외를 throw
	// method 선언부에 명시
	/*
	 * accessModifier returnType methodName() throws 예외class명1, 예외class명2...{
	 * 
	 * }
	 */

	public void test2(String filename) throws /* FileNotFoundException, */ IOException {
		FileReader fr = new FileReader(filename);
		System.out.println((char) fr.read());
		System.out.println((char) fr.read());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest01 obj = new ThrowsTest01();

		// A 위치에서 호출
		obj.test("test2.txt");

		// B 위치에서 호출
		obj.test("test3.txt");// test method는 예외가 발생한 method 내부에서 Exception에 대한 처리를 했기 떄문에 호출하는 곳에서는 모두 동일한
								// 방법으로 처리된 결과만 확인 가능

		System.out.println("----------------------------------------------");

		// A 위치
		try {
			obj.test2("test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("A가 원하는 유형으로 처리 - 파일을 찾을 수 없습니다. 다시 선택하시겠습니까?");
		} catch (IOException e) {
		}

		// B 위치
		try {
			obj.test2("test3.txt");
		} catch (FileNotFoundException e) {
			System.out.println("A가 원하는 유형으로 처리 - 파일을 찾을 수 없습니다. 프로그램을 종료합니다.");
		} catch (IOException e) {
		}
	}

}
