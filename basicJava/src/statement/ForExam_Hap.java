package statement;
//1~100까지 합
//총합:
//짝수합:
//홀수합:
public class ForExam_Hap {

	public static void main(String[] args) {
		int total=0;
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			total=total+i;
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
				
		}
		System.out.println("총합: "+total);
		System.out.println("짝수합: "+even);
		System.out.println("홀수합: "+odd);
	}

}
