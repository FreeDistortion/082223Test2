package additionalHW.seven.two;

public abstract class Shape {
	protected Point point;

	public Shape() {

	}

	
	public Shape(Point point) {
		super();
		this.point = point;
	}


	public abstract double getArea();
	public abstract double getCircumference();
	public abstract int getLen();
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	

}
