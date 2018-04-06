package jh;

public class Worm extends Animal {
	protected int maximumDepth;
	protected boolean tasty4Fish;
	
	public void setMaxDepth(int dpt) { this.maximumDepth = dpt; }
	public void setTasty(boolean tasty) { this.tasty4Fish = tasty; }
	
	public int getMaxDepth() { return this.maximumDepth; }
	public boolean getTasty4Fish() { return this.tasty4Fish; }
	
	@Override
	public String getAnimalName() {
		return "Worm";
	}

}
