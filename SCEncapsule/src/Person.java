
public class Person {
	private int age;
	private String firstName, lastName;
	private double height, weight;

	// Getters
	public int getAge() { return this.age; }
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public double getHeight() { return this.height; }
	public double getWeight() { return this.weight; };
	
	// Setters
	public void setAge( int age ) { this.age = age;	}
	public void setFirstName( String firstName ) { this.firstName = firstName; }
	public void setLastName( String lastName ) { this.lastName = lastName; }
	public void setHeight( double height ) { this.height = height; }
	public void setWeight( double weight ) { this.weight = weight; }
	
}
