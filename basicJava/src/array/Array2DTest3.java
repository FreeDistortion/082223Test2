package array;
//가변배열 - 다차원배열은 배열의 요소가 참조하는 배열의 사이즈를 다르게 생성할 수 있다.
public class Array2DTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[][] myArr=new char[5][];
//		myArr[0]= new char[1];
//		myArr[1]= new char[2];
//		myArr[2]= new char[3];
//		myArr[3]= new char[4];
//		myArr[4]= new char[5];
		
		char[][] myArr= {
				{'*'},
				{'*', '*'},
				{'*', '*', '*'},
				{'*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
		};
		
		//값 할당
		for(int row=0;row<myArr.length;row++) {
			for(int col=0;col<myArr[row].length;col++) {
				myArr[row][col]='*';
				
			}
		}
		
		//2차원 가변배열에서 값 꺼내 출력
		for(int row=0;row<myArr.length;row++) {
			for(int col=0;col<myArr[row].length;col++) {
				myArr[row][col]='*';
				System.out.print(myArr[row][col]);
			}
			System.out.println();
		}
	}

}
