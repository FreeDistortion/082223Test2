package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCopyBuffer {

	public static void main(String[] args) {
		// FileReaderTest.java 파일 읽어서 data 폴더에 output2.txt로 복사 및 화면에 출력.
		// 읽기: BufferedReader
		// 쓰기: FileWriter
		BufferedReader fr = null;
		FileWriter fw = null;
		long count=0;
		try {
			//1. file open - OS와 통신해서 file open
			fr = new BufferedReader(new FileReader("src/api/io/FileReaderTest.java"));
			fw = new FileWriter("src/data/output2.txt");
			//2. file access
			long start=System.nanoTime();
			while (true) {
				String d = fr.readLine();
				if (d == null) {
					break;
				}
				fw.write(d+"\n");
				System.out.println(d);
				count++;
			}
			long end=System.nanoTime();
			System.out.println("Running time: "+(end-start));
			System.out.println("Run count: "+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fr != null) {

			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}

	}

}
