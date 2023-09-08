package api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Grade {

	public static void main(String args[]) {

		Grade grade = new Grade();

		String fileName = "score.txt";
		grade.printGrade(fileName);

	}

	public void printGrade(String fileName) {

		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader bf = null;
		int sum=0;
		int peopleCount=0;
		try {
			bf = new BufferedReader(new FileReader("src/data/" + fileName));
			while (true) {
				String str[] = bf.readLine().split(",");
				if (str == null) {
					break;
				}
				int i=0;
				peopleCount++;
				sum+=Integer.parseInt(str[i+1]);
				System.out.println(str[i]+"의 점수는 "+str[i+1]+"점 입니다.");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("모두의 총점은 "+sum+"입니다.");
		System.out.println("모두의 평균은 "+(sum/peopleCount)+"입니다.");

	}

}