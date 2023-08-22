package statement;

public class MultiForExam1 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==3&col==3) {
					System.out.print("너");
					col++;
				}
				System.out.print("2");
			}
			System.out.println();
		}
			
	}

}
