package additionalHW.seven.two;

public class Circle extends Shape implements Movable {
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int radius, int x, int y) {
		super();
		this.radius = radius;
		super.point = new Point(x, y);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		point.setX(x + 1);
		point.setY(y + 1);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.ceil(Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return Math.ceil(2 * Math.PI * radius);
	}

	@Override
	public int getLen() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
