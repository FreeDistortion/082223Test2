package statement;
//1~100까지 합
//총합:
//짝수합:
//홀수합:
public class WhileExam1 {

	public static void main(String[] args) {
		int total=0;
		int even=0;
		int odd=0;
		int i=1;
		while(i<=100) {
			total=total+i;
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
			i++;	
		}
		System.out.println("총합: "+total);
		System.out.println("짝수합: "+even);
		System.out.println("홀수합: "+odd);
	}

}
