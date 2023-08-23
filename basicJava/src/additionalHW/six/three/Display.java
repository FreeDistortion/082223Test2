package additionalHW.six.three;

public abstract class Display {
	abstract int getColumns();
	abstract int getRows();
	abstract String getRowText(int row);//row번째 문자열 리턴
	final void show() {//모두 출력
		for(int row=0;row<getRows();row++) {
				System.out.println(getRowText(row));
		}
	}
	
}
