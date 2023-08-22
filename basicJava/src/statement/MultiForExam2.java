package statement;

public class MultiForExam2 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=5;j++) {
				System.out.print((j+5*i)+"\t");
			}
			System.out.println();
		}
		/*
		for(int i=1;i<=5;i++)
		{
			int num=1;
			for(int j=1;j<=5;j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
		*/
	}

}
