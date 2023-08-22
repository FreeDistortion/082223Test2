package HW;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		Scanner menuKey, usageKey;
		double totalUsage=0; double totalFee=0;
		System.out.println("-----Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("---------------------");
		System.out.println("메뉴를 선택하세요=> ");
		System.out.println("---------------------");
		menuKey=new Scanner(System.in);
		int menuNum=menuKey.nextInt();
		System.out.println("사용량을 입력하세요=> ");
		usageKey=new Scanner(System.in);
		double usage=usageKey.nextDouble();
		
		switch(menuNum) {
			case 1:
				totalUsage=usage*50; totalFee=totalUsage*1.05;
				break;
			case 2:
				totalUsage=usage*50; totalFee=totalUsage*1.05;
				break;
			case 3:
				totalUsage=usage*50; totalFee=totalUsage*1.05;
				break;
		}
		System.out.println("=======================");
		System.out.println("사용자 코드: "+menuNum);
		System.out.println("사용요금: "+totalUsage);
		System.out.println("총수도 요금: "+totalFee);
		System.out.println("=======================");
		
	}

}
