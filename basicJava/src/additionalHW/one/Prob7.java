package additionalHW.one;

public class Prob7 {
	
	public static void main(String args[]) {
		
		int n = 15; 
		int sum = 0;
		int d = 0;
		 
		/*  여기에 프로그램을 완성하십시오. */
		for(int i=1;i<=n;i++) {
			d+=i-1;
			sum+=1+d;
		}
		System.out.println(d);
		System.out.println( n + "번째까지의 합 : " + sum);
	}

}
