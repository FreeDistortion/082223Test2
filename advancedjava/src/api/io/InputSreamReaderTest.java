package api.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

//InputStreamReader 이용해서 한글 입력될 수 있도록 처리.
//소스 변경 없이 API 사용 부분만 변경.

public class InputSreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream myIS=System.in;
		InputStreamReader myISR= new InputStreamReader(myIS);
		PrintStream myout = System.out;
		myout.println("Hi.");
		try {
			while (true) {
				int data = myISR.read();
				//엔터의 ascii가 13임.
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
