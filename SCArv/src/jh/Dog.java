package jh;

public class Dog extends Animal {
	protected boolean guardDog;
	protected int age;
	
	public void setGuardDog(boolean guard) { this.guardDog = guard; }
	public void setAge(int age) { this.age = age; }
	
	public boolean getGuardDog() { return this.guardDog; }
	public int getAge() { return this.age; }

	@Override
	public String getAnimalName() {
		return "Dog";
	}

}
