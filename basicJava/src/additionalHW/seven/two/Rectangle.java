package additionalHW.seven.two;

public class Rectangle extends Shape implements Movable {
	private int width;

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int x, int y) {
		super();
		this.width = width;
		super.point = new Point(x, y);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		point.setX(x + 2);
		point.setY(y + 2);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.ceil(Math.pow(width, 2));
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return Math.ceil(4 * width);
	}

	@Override
	public int getLen() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
