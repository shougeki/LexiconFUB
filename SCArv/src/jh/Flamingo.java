package jh;

public class Flamingo extends Bird {
	protected String color;
	
	public void setColor(String c) { this.color=c; }
	public String getColor() { return this.color; }

	@Override
	public String getAnimalName() {
		return "Flamingo";
	}
}
