package oop.basic.constructor;

public class Rectangle2 {
	private int width;
	private int height;
	private String color;
	
	public Rectangle2() {
		width=0;
		height=0;
		color=null;
	}

	
	public Rectangle2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public Rectangle2(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	
	public int area() {
		int area=0;
		area=width*height;
		return area;
	}
	public int perimeter() {
		int parimeter=0;
		parimeter=2*(width+height);
		return parimeter;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
