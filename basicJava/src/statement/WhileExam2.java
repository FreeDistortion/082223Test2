package statement;

import java.util.Scanner;

//단을 입력 받아 구구단을 출력
//단: x
//x*1=x ~ x*9=9x
public class WhileExam2{

	public static void main(String[] args) {
		System.out.print("단 입력: ");
		Scanner key=new Scanner(System.in);
		int tVal=key.nextInt();
		if(tVal>=1|tVal<=9) {
			int i=1;
			while(i<=9){
				System.out.println(tVal+"*"+i+"="+(tVal*i));
				i++;
			}
		}
		else {
			System.out.println("1에서 9 사이의 정수를 입력하세요.");
		}
	}

}
