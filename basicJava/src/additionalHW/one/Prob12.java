package additionalHW.one;

import java.util.Arrays;

public class Prob12 {
	public static void main(String args[]) {
		// 구현하시오.
		int[] intArr= {3,24,1,55,17,43,5};
		int temp;
		
//		for(int i =0;i<intArr.length;i++) {
//			for(int j=0;j<intArr.length-(i+1);j++) {
//				if(intArr[j]>intArr[j+1]) {
//					temp=intArr[j];
//					intArr[j]=intArr[j+1];
//					intArr[j+1]=temp;
//				}
//			}
//		}
//		for(int i =0;i<intArr.length;i++) {
//			System.out.print(intArr[i]+" ");
//		}
		for(int i =0 ; i<intArr.length;i++) {
			for(int j=0;j<intArr.length-(i+1);j++) {
				temp=Math.max(intArr[j], intArr[j+1]);
				intArr[j]=Math.min(intArr[j], intArr[j+1]);
				intArr[j+1]=temp;
//					temp=intArr[j];
//					intArr[j]=intArr[j+1];
//					intArr[j+1]=temp;
//				
			}	
		}
		System.out.println(Arrays.toString(intArr));
		
		for(int i =0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
			
		}
}
}
