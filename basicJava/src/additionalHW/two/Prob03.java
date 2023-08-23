package additionalHW.two;
public class Prob03 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.print();  // 첫번째 출력문
		t.power();
		t.print();  // 두번째 출력문
		t.channelUp();
		t.channelUp();
		t.print(); // 세번째 출력문
		
	}
}
class Tv{
	private String color;
	private boolean power;
	private int channel;
	public Tv() {
		super();
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}
	public void power() {
		power=true;
	}
	public void channelUp() {
		channel++;
	}
	public void print() {
		System.out.println("color\t:"+color+"\tpower:"+power+"\tchannel:"+channel);
	}
}
