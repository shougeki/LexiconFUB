package jh;

public class Rectangle extends Shape {

	private int length;
	private int height;
	
	public void setHeight(int x) { this.height = x ;}
	public void setLength(int x) { this.length = x ;}
	
	@Override
	double calculateArea() {
		return (this.length * this.height);
	}
}
