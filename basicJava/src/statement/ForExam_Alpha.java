package statement;
//ABCD~Z
public class ForExam_Alpha {

	public static void main(String[] args) {
		int val=(int)'A';
		for(int i=0;i<=25;i++) {
			System.out.print((char)(val+i));
		}
		
		System.out.println();
		
		for(int i='A';i<='Z';i++)
		{
			System.out.print((char)i);
		}
		
		System.out.println();
		
		for(char i='A';i<='Z';i++)
		{
			System.out.print(i);
		}
	}

}
