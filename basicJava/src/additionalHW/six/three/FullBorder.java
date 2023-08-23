package additionalHW.six.three;

public class FullBorder extends Border {

	public FullBorder(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns() + 2;
	}

	@Override
	int getRows() {
		// TODO Auto-generated method stub
		return display.getRows() + 2;
	}

	@Override
	String getRowText(int row) {
		// TODO Auto-generated method stub
		if (row == 0 | row == (display.getRows() + 1)) {
			return makeLine('-', display.getColumns());
		} else {
			return "|" + display.getRowText(row-1) + "|";
		}

	}

	String makeLine(char ch, int count) {

		String tem = "";
			for (int i = 0; i < count + 2; i++) {
				tem += String.valueOf(ch);
			}
		return tem;
	}

}
