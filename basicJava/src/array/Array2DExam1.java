package array;
/*
 * * B C D E
 * F * H I J
 * K L * N O
 * P Q R * T
 * U V W X *
 * 
 * String배열
 */
public class Array2DExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphaNum='A';
		String[][] strArr=new String[5][5];
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				strArr[i][j]=alphaNum+"";
				if(i==j) {
					strArr[i][j]="*";
				}
				alphaNum++;
			}
		}
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
	}

}
