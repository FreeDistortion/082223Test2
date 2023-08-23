package additionalHW.six.three;

public class StringDisplay extends Display{
	String string;

	public StringDisplay(String string) {
		super();
		this.string = string;
	}

	@Override
	int getColumns() {
		// TODO Auto-generated method stub
		return string.getBytes().length;
	}

	@Override
	int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row==0) {
			return this.string;
		}
		else {
			return null;
		}
	}
	
}
