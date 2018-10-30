package main;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
	}
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return iLength*iWidth;
	}
	
	@Override 
	public double perimeter() {
		return (2*iLength)+(2*iWidth);
	}
	
	public int compareTo(Object Rectangle) {
		
	}
}
