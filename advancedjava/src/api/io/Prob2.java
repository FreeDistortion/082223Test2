package api.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.LambdaConversionException;

public class Prob2 {

	public static void main(String[] args) {
		Prob2 p2 = new Prob2();
		p2.printScore("src/data/data2.txt");
	}

	public void printScore(String fileName){
		BufferedReader bf=null;
			try {
				bf=new BufferedReader(new FileReader(fileName));
				System.out.println("Main method execution result");
				while (true) {
					String str=bf.readLine();
					if(str==null) {break;}
					String[] strArr=str.split("/");
					var sum=0;
					int num=0;
					for (String string : strArr) {
						try {
							num =Integer.parseInt(string);
							sum+=num;
							}
						catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					if(sum==0) {
						System.out.print(strArr[0]+"\t"+strArr[1]+"\t"+strArr[2]+"\t"+strArr[3]+"\t총점");

					}else {
					System.out.print(strArr[0]+"\t"+strArr[1]+"\t"+strArr[2]+"\t"+strArr[3]+"\t"+sum);}
					System.out.println();
					
				}	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException e) {
				e.printStackTrace();// TODO: handle exception
			}finally {
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
}
