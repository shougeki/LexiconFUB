package jh;

public class Bird extends Animal {
	protected boolean migrates;
	protected boolean waterfowl;
	
	public boolean getMigrate() { return this.migrates; }
	public boolean getWaterowl() { return this.waterfowl; }
	
	public void setMigrate(boolean migrate) { this.migrates = migrate; }
	public void setWaterfowl(boolean water) { this.waterfowl = water; }
	
	@Override
	public String getAnimalName() {
		return "Bird";
	}
	
}
