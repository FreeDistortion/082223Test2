package additionalHW.six.six;

public class Product {
	private int pCode;
	private String eachAndPackString;
	private int packNum;
	private int eachPer;
	private double packPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int pCode, String eachAndPackString, int packNum) {
		super();
		this.pCode = pCode-1;
		this.eachAndPackString = eachAndPackString;
		this.packNum = packNum;
		divide(eachAndPackString);
	}
	

	private void divide(String eachAndPackString) {
		// TODO Auto-generated method stub
		String[] eachAndPack=eachAndPackString.split(",");
		int eachPer=Integer.valueOf(eachAndPack[0]);
		setEachPer(eachPer);
		double packPrice=Double.valueOf(eachAndPack[1]);
		setPackPrice(packPrice);
	}
	
	
	public int getpCode() {
		return pCode;
	}


	public void setpCode(int pCode) {
		this.pCode = pCode;
	}


	public String getEachAndPackString() {
		return eachAndPackString;
	}


	public void setEachAndPackString(String eachAndPackString) {
		this.eachAndPackString = eachAndPackString;
	}


	public int getPackNum() {
		return packNum;
	}


	public void setPackNum(int packNum) {
		this.packNum = packNum;
	}


	public int getEachPer() {
		return eachPer;
	}


	private void setEachPer(int eachPer) {
		this.eachPer = eachPer;
	}


	public double getPackPrice() {
		return packPrice;
	}


	private void setPackPrice(double packPrice) {
		this.packPrice = packPrice;
	}
	

}
