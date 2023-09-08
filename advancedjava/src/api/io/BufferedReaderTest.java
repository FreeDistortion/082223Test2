package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//내부에서 Buffer를 이영해서 data를 저장하고 읽을 수 있도록 관리.
public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		// keyboard 입력을 BufferedReader로 읽기
		long start = System.nanoTime();
		String line = br.readLine();
		System.out.println(line);
		long end = System.nanoTime();
		System.out.println((end - start));

		// file을 BufferedReader를 이용해서 읽기
		BufferedReader br2=new BufferedReader(new FileReader("src/data/test.txt"));
		System.out.println(br2.readLine());

	}

}
