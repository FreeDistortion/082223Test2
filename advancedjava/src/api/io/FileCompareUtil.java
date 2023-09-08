package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {

	public static void main(String[] args) {
		String fString = "src/data/fstFile1.txt";
		String sString = "src/data/scdFile1.txt";
		ArrayList<String> a = new ArrayList<>();
		FileCompareUtil f = new FileCompareUtil();
		try {
			a = f.compareFile(fString, sString);
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		// implements compareFile method.
		BufferedReader bf1 = null;
		BufferedReader bf2 = null;
		ArrayList<String> arrList = new ArrayList<String>();
		
			bf1 = new BufferedReader(new FileReader(fstFileName));
			bf2 = new BufferedReader(new FileReader(scdFileName));
			int lineno=0;
			while (true) {
				String bf1RL = bf1.readLine();
				String bf2RL = bf2.readLine();
				if (bf1RL == null || bf2RL == null) {
					break;
				}
				lineno++;
			if (!(bf1RL.equals(bf2RL))) {
				arrList.add("Line "+(lineno)+": ");
				arrList.add(bf2RL);
			}else {continue;}
			}
		return arrList;
	}
}
