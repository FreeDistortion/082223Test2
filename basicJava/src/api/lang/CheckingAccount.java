package api.lang;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	//지불금액이 내 잔액보다 <= , 카드번호가 일치
	//무조건 문자열의 비교는 equals메소드를 이용해서 비교한다.
	public void pay(long amount,String	cardNo) {
		if(this.cardNo.equals(cardNo) & getBalance()>=amount) {//만약 이 부분에서 equals가 아닌 ==를 쓰면 heap에 올라간 주소만을 참조하기 때문에, 본class에서 new로 객체를 할당받아 해당 method를 실행하면 의도와는 다르게 두 값이 같다는 대참사 결과가 나온다고 한다 ㅇㅇ...
			
			withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다");
		}
	}
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
