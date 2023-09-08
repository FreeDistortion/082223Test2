package api.io;

import java.io.FileWriter;

//파일을 문자 단위로 출력
//FilwWriter는 파일이 없으면 파일을 생성.
//-> 출력은 기본이 덮어쓰기
public class FileWriterTest {

	public static void main(String[] args) throws Exception{
		//1. File Open
		FileWriter fw = new FileWriter("src/data/output.txt",true);//log file을 쓰고 싶으면 append mode를 true로 해준다.
		//2. File Access
		fw.write(97);
		fw.write("yo.\n");
		fw.write("<SNOOP-DOG>\n");
		//3. File Close
		fw.close();
	}

}
