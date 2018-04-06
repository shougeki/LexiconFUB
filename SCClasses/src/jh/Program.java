package jh;

/**
 * @author JH
 *
 */
public class Program {

	public static void main(String[] args) {
		
		Shape myTriangle = new Triangle(3,4);
		printArea(myTriangle);
		
		Rectangle myRect = new Rectangle();
		myRect.setHeight(3);
		myRect.setLength(4);
		printArea(myRect);
		
		Square mySquare = new Square();
		mySquare.setSide(4);
		printArea(mySquare);
	}
	
	public static void printArea(Shape s) {
		System.out.println( s.calculateArea() );
	}
}
