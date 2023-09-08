package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;

public class FileCopy {

	public static void main(String[] args) {
		// FileReaderTest.java 파일 읽어서 data 폴더에 output2.txt로 복사 및 화면에 출력
		FileReader fr = null;
		FileWriter fw = null;
		try {
			long count=0;
			//1. file open - OS와 통신해서 file open
			fr = new FileReader("src/api/io/FileReaderTest.java");
			fw = new FileWriter("src/data/output2.txt");
			//2. file access
			long start=System.nanoTime();
			while (true) {
				int d = fr.read();
				if (d == -1) {
					break;
				}
				fw.write(d);
				System.out.print((char) d);
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
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
