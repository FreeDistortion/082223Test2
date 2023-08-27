package additionalHW;

public class Prob5 {
	public static void main(String args[]) {
		Prob5 p5=new Prob5();
		System.out.println(p5.gcd(2,5));
		System.out.println(p5.gcd(5,15));
		System.out.println(p5.gcd(250,30));
	}
	public int gcd(int num1,int num2) {
		int bNum;
		int sNum;
		int divNum=0;
		if(num1>=num2) {
			bNum=num1;
			sNum=num2;
		}else {
			bNum=num2;
			sNum=num1;
		}
		
		
		for(int i =bNum-1;i>=1;i--) {
			if(bNum%i==0) {
				divNum=i;
				if(sNum%divNum==0) {
					return divNum;
				}else {
					continue;
					
				}
			}
		}
		return 1;

	}


}