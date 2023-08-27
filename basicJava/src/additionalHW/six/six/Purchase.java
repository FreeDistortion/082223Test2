package additionalHW.six.six;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Purchase {
	// TODO : 멤버 변수를 선언합니다. (nameOfProduct, totalStockOfPack)
	private static String nameOfProduct[] = { "사과", "오렌지", "포도", "딸기" };
	private static int totalStockofPack[] = { 3, 5, 20, 1 };

	public static void main(String[] args) throws Exception {
		Purchase purchase = new Purchase();

		Product product = purchase.getProduct();
		double totalPrice = purchase.calcTotalPrice(product);

		StringBuffer sb = new StringBuffer();
//		int sltCodeOfProduct = product.getpCode();
//		String productName = nameOfProduct[sltCodeOfProduct];
//		int productPackNum = product.getPackNum();
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put(productName, productPackNum);
		// TODO : 프린트할 결과 문장을 변수 sb에 append 합니다.
//		if (map.get(productName) > totalStockofPack[sltCodeOfProduct]) {
//			sb.append("재고가 없어 "+productPackNum+"개의 "+productName+" 상품팩에 대한 구매가 불가합니다. 죄송합니다.");
//		} else {
//			sb.append(productPackNum + "개의 " + productName + "(을)를 구매하였습니다.");
//			sb.append(productName+" 한 개의 가격은 "+(product.getPackPrice()/product.getEachPer())+"원이며, 지불해야 할 총 금액은 "+totalPrice+"원입니다.");
//		}
		int sltCodeOfProduct = product.getpCode();

		String productName = nameOfProduct[sltCodeOfProduct];

		int productPackNum = product.getPackNum();

		if(totalPrice==-1) {
			sb.append("재고가 없어 "+productPackNum+"개의 "+productName+" 상품팩에 대한 구매가 불가합니다. 죄송합니다.");
		}else {
			sb.append(productPackNum + "개의 " + productName + "(을)를 구매하였습니다.");
			sb.append(productName+" 한 개의 가격은 "+(product.getPackPrice()/product.getEachPer())+"원이며, 지불해야 할 총 금액은 "+totalPrice+"원입니다.");
		}
		
		System.out.println(sb.toString());
	}

	public Product getProduct() throws Exception {
		// TODO : 사용자로부터 상품코드, 상품팩에 포함된 상품 개수, 상품팩 가격, 구매할 상품팩의 개수를
		// 입력받아 Product 객체를 리턴합니다.

		Scanner key = new Scanner(System.in);
		try {
			System.out.print("구매하려는 상품코드를 선택하세요. [1:사과,2:오렌지,3:포도,4:딸기] ? ");
			int pCode = key.nextInt();
			System.out.print("상품팩에 포함된 상품의 개수, 상품팩의 가격을 순서대로 입력하세요 (구분자:,) ? ");
			String eachAndPackString = key.next();
			System.out.print("구매하려는 상품팩의 개수를 입력하세요 ? ");
			int packNum = key.nextInt();

			Product product = new Product(pCode, eachAndPackString, packNum);
			
			return product;
		} catch (Exception e) {
			System.out.println("Error occured. Please retry it.");// TODO: handle exception
			getProduct();
		}
		return null;
	}

	public double calcTotalPrice(Product product) throws Exception {
		// TODO : Product 객체로부터 필요한 정보를 추출하여 재고량을 체크하고, 지불해야 할 총 금액을 리턴합니다.
		// 재고량이 부족할 경우 -1을 리턴합니다.
		int sltCodeOfProduct = product.getpCode();
		String productName = nameOfProduct[sltCodeOfProduct];
		int productPackNum = product.getPackNum();
		HashMap<String, Integer> map = new HashMap<>();
		map.put(productName, productPackNum);
		if (map.get(productName) > totalStockofPack[sltCodeOfProduct]) {
			return -1;
		}
		else {
		double totalPrice;
		totalPrice=product.getPackPrice()*product.getPackNum();
		return totalPrice;}
	}

}
