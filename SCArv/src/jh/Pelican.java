package jh;

public class Pelican extends Bird {
	protected boolean noisy;
	
	public boolean getNoisy() { return this.noisy; }
	public void setNoisy(boolean noise) { this.noisy = noise; }

	@Override
	public String getAnimalName() {
		return "Pelican";
	}

}
