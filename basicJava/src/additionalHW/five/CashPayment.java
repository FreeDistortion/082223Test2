package additionalHW.five;

public class CashPayment extends Payment{
	private String casgRceiptNumber;

	public CashPayment(String shopName, String productName, long productPrice, String casgRceiptNumber) {
		super(shopName, productName, productPrice);
		this.casgRceiptNumber = casgRceiptNumber;
	}

	@Override
	public void pay() throws PayException {
		// TODO Auto-generated method stub
		if(productPrice<=0) {
			throw new PayException("가격이 잘못되었습니다.");
		}else {
			System.out.println("신용카드가 정상적으로 지불되었습니다.");
			System.out.println("[\t신용카드 결제 정보\t]");
			toString();
		}
	}

	@Override
	public String toString() {
		return "상점명\t:\t"+shopName+"\n상품명\t:\t"+productName+"\n상품가격\t:\t"+productPrice+"\n현금영수증번호\t:\t"+casgRceiptNumber;
	}
	
	
	
}
