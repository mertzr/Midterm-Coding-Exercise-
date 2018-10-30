package main;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth,iLength);
	}
	
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	@Override 
	public double area() {
		return (2*getiLength()*getiWidth())+(2*getiLength()*iDepth)+(2*getiWidth()*iDepth);
		
	}
	public double volume() {
		return getiLength()*getiWidth()*iDepth;
	}
	@Override 
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	public int compareTo(Object Cuboid) {
		
	}
}
