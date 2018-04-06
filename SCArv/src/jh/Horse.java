package jh;

public class Horse extends Animal {
	protected boolean innoculated;
	protected boolean raceHorse;
	
	public void setRaceHorse(boolean racer) { this.raceHorse = racer; }
	public void setVaccinated(boolean vax) { this.innoculated = vax; }
	
	public boolean getRaceHorse() { return this.raceHorse; }
	public boolean getVaccinated() { return this.innoculated; }
	
	@Override
	public String getAnimalName() {
		return "Horse";
	}
	
}
