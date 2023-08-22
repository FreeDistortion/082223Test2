package oop.basic.constructor;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	private int area;
	
	public Rectangle() {
		width=0;
		height=0;
		color=null;
	}

	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		color="흰색";
	}


	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	
//	public int calculateArea() {
//		area=width*height;
//		return area;
//	}
	public void calculateArea() {
		area=width*height;
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
}
