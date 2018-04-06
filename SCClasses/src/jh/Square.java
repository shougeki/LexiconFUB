package jh;

public class Square extends Rectangle {
	public void setSide(int side) { 
		super.setHeight(side); 
		super.setLength(side);
	}
	
	@Override
	public void setHeight(int height) { this.setSide(height); }
	
	@Override
	public void setLength(int length) { this.setSide(length); }
}
