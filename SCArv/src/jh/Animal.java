package jh;

public abstract class Animal {
	
	protected int legs;
	protected boolean tail;
	protected boolean fur;
	protected boolean meatEater;
	
	public void setLegs( int legs ) { this.legs = legs; }
	public void setTail( boolean tail ) { this.tail = tail; }
	public void setFur( boolean fur) { this.fur = fur;}
	public void setMeatEater( boolean meatEater ) { this.meatEater = meatEater; }
	
	public int getLegs() { return this.legs; }
	public boolean getTail() { return this.tail; }
	public boolean getFur() { return this.fur; }
	public boolean getMeatEater() { return this.meatEater; }
	
	abstract public String getAnimalName(); 
}
