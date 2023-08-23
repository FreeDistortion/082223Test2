package additionalHW.six.three;

public class SideBorder extends Border{
	char borderChar;

	public SideBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns()+2;
	}

	@Override
	int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}

	@Override
	String getRowText(int row) {
		// TODO Auto-generated method stub
		return borderChar+display.getRowText(row)+borderChar;
	}
	
}
