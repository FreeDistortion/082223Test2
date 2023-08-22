package HW;

public class ArrayExam3 {

	public static void main(String[] args) {
		int[] ia=new int[] {3,7,1,8,10,2,15,2,10};
		int[] ib=new int[] {1,2,3,4,5};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<ia.length;i++) {
			if(ia[i]%2==0) {
				even+=ia[i];
			}
			else {
				odd+=ia[i];
			}
		}
		System.out.println("(	배열 ia	)");
		System.out.println("홀수의 합: "+odd);
		System.out.println("짝수의 합: "+even);
		even=0;odd=0;
		for(int i=0;i<ib.length;i++) {
			if(ib[i]%2==0) {
				even+=ib[i];
			}
			else {
				odd+=ib[i];
			}
		}
		System.out.println("(	배열 ib	)");
		System.out.println("홀수의 합: "+odd);
		System.out.println("짝수의 합: "+even);
		
	}

}
