package jh;

public class Triangle extends Shape {
	
	private int length;
	private int heigth;
	
	public Triangle(int length, int heigth) {
		this.length = length;
		this.heigth = heigth;
	}
	
	@Override
	double calculateArea() {
		return (heigth * length)/2;
	}
}
