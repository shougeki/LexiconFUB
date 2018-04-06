package johan.codealong;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String occupation;
	

	/* First Name */	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	/* Last Name */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	/* Full name */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}


	/* Occupation */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	/* Age */
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
