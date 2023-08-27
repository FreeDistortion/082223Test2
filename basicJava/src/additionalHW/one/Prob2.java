package additionalHW;

public class Prob2 {

	public static void main(String[] args) {
		int limit = 50;
		boolean isPrime = false;
		int pNum;
		int count;
    		//���α׷��� �����ϼ���.
		for(pNum=2;pNum<=limit;pNum++) {
			count=0;
			for(int i=2;i<=limit;i++) {
				if(pNum%i==0) {
					count++;
					continue;
				}
			}
			if (count==1) {
				isPrime=true;
				System.out.println(pNum);
			}
		}
	}

}
