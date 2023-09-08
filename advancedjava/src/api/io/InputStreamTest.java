package api.io;

import java.io.InputStream;
import java.io.PrintStream;

//byte 단위 입력을 위한 class의 상위 class인 InputStream
//keyboard로 입력한 문자를 읽어서 return
public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream myin = System.in;
		PrintStream myout = System.out;
		myout.println("Hi.");
		try {
			while (true) {
				int data = myin.read();
				if (data == 13) {
					break;
				}
				myout.print((char) data);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.addSuppressed(e);
		}
	}

}
