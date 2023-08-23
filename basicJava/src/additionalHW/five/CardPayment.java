package additionalHW.five;

public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword,
			int monthlyInstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}
	@Override
	public void pay() throws PayException  {
		// TODO Auto-generated method stub
		
		if(productPrice<=0|monthlyInstallment<0) {
			throw new PayException("가격이나 할부 개월수가 잘못되었습니다.");
		}else {
			System.out.println("신용카드가 정상적으로 지불되었습니다.");
			System.out.println("[\t신용카드 결제 정보\t]");
			toString();
		}
	}
	@Override
	public String toString() {
		return "상점명\t:\t"+shopName+"\n상품명\t:\t"+productName+"\n상품가격\t:\t"+productPrice+"\n신용카드번호\t:\t"+cardNumber+"\n할부개월\t:\t"+monthlyInstallment;
	}
	
	
}
