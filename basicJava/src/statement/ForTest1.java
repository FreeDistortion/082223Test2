package statement;
//for기본
public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("Start");
		for (int i=1;i<=5;i++) {
			System.out.println("자바프로그램: "+i);
		}
		System.out.println("=================");
		
		for(int i=10;i<=15;i=i+2) {
			System.out.println("자바프로그램: "+i);
		}
		System.out.println("=================");
		
		for(int i=10;i>=1;i--) {
			System.out.println("자바프로그램: "+i);
		}
		System.out.println("=================");
	}

}
