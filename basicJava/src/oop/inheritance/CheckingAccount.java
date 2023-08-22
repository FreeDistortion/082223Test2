package oop.inheritance;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount(String accId,String ownerName, long balance, String cardNo) {
		super(accId, ownerName, balance);
		this.cardNo = cardNo;
	}
	public void pay(long amount, String cardNo) {
		
		if(cardNo.equals(this.cardNo)&super.getBalance()>amount){
			long newB=super.getBalance();
			newB-=amount;
			super.setBalance(newB);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
