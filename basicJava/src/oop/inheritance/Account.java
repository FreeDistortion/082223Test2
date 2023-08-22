package oop.inheritance;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account() {
		
	}

	public Account(String accId, String ownerName, long balance) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public void deposit(long amount) {
		balance+=amount;
	}
	public void withdraw(long amount) {
		balance-=amount;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
