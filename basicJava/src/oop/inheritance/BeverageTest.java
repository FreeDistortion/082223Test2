package oop.inheritance;

class Beverage{
	private String type;
	private int price;
	
	public Beverage() {
		
	}
	public Beverage(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Coffee extends Beverage{
	private String name;

	public Coffee(String type, int price, String name) {
		super(type, price);
		this.name = name;
	}
	public void print() {
		System.out.println("타입: "+getType()+",\t가격: "+getPrice()+",\t이름: "+name);
	}
	
}

public class BeverageTest {
	public static void main(String[] args) {
        Coffee obj1 = new Coffee("커피",2500,"아메리카노");
        Coffee obj2 = new Coffee("커피",2700,"카페라뗴");
        Coffee obj3 = new Coffee("커피",300,"카푸치노");
        obj1.print();
        obj2.print();
        obj3.print();
        
        
	}

}
