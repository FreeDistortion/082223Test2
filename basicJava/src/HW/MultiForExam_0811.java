package HW;

public class MultiForExam_0811 {

	public static void main(String[] args) {
		int count, number, prime;
		count=0; number=0;
		System.out.println("소수구하기");
		for(int i=1;i<=100;i++)
		{
			for(prime=1;prime<=i;prime++)
			{
				if(i%prime==0) {
					count++;
				}else {}
			}
			if(count==2) {
				System.out.println(i+"=> 소수입니다.");
				number++;
			}else {}
			count=0;
		}
		System.out.println("소수의 개수=> "+number);
	}

}
