package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일에서 byte 단위로 data 읽기

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis=null;		
		try {
			//file 경로를 주지 않고 이름만 임력하는 경우 기본 위치에서 탐색.
			//기본 위치: PJ 폴더
			//1. file open - OS와 통신해서 읽을 file을 open하는 작업.
			fis=new FileInputStream("test.txt");
			
			//2. file access
			while (true) {
				int data=fis.read();
				if (data==-1) {//key board에서 입력받을 땐 enter가 end of file이 아니지만, File.read() method에선 end of data를 -1로 명시하고 있음.
				break;	
				}
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. file close
			try {
				if(fis!=null) {fis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
