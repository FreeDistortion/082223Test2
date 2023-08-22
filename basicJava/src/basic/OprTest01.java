package basic;

public class OprTest01 {
	public static void main(String[] args) {
		double reset=5;
		double x, y;
		x=reset;
		y=x++;
		System.out.println("case: y=x++\n--> x="+x+" y="+y);
		x=reset;
		y=++x;
		System.out.println("case: y=++x\n--> x="+x+" y="+y);
		x=reset;
		y=x--;
		System.out.println("case: y=x--\n--> x="+x+" y="+y);
		x=reset;
		y=--x;
		System.out.println("case: y=--x\n--> x="+x+" y="+y);
	}

}
