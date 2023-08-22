package statement;

import java.util.Random;
import java.util.Scanner;

public class IfExamWant {
	public static void main(String[] args) {
		Scanner tempNum=new Scanner(System.in);
		double inpNum=tempNum.nextDouble();
		if(inpNum%5==0)
		{
			System.out.println(inpNum+"은(는) 5의 배수.");
		}
		else
		{
			System.out.println(inpNum+"은(는) 5의 배수가 아님.");
		}
		
		Random rand=new Random();
		int randNum=rand.nextInt(10)+1;
		if(randNum>=0)
		{
			if(randNum==0)
			{
				System.out.println(randNum+"은(는) 0입니다.");
			}
			else
			{
				if(randNum%2==0)
				{
					System.out.println(randNum+"은(는) 양수이면서 짝수입니다.");
				}
				else
				{
					System.out.println(randNum+"은(는) 양수이면서 홀수입니다.");
				}
			}
		}
		else
		{
			System.out.println(randNum+"은(는) 음수입니다.");
		}

	}

}
