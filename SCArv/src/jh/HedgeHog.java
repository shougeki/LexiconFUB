package jh;

public class HedgeHog extends Animal {
	protected boolean bald;  // Baldness in hedgehogs is increasing
	protected boolean sonic; // This is sonic the hedgehog

	public void setBald(boolean bald) { this.bald = bald; }
	public void setSonic(boolean sonic) {this.sonic = sonic; }
	
	public boolean getBald() { return this.bald; }
	public boolean getSonic() { return this.sonic; }
	
	@Override
	public String getAnimalName() {
		return "Hedgehog";
	}

}
