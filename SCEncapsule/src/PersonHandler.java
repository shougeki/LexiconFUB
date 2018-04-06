
public class PersonHandler {
	
	public Person CreatePerson(int age, String fName, String lName, double height, double weight) {
		Person p = new Person();
		
		p.setAge(age);
		p.setFirstName(fName);
		p.setLastName(lName);
		p.setHeight(height);
		p.setWeight(weight);
		
		return p;
	}
	
	public void SetAge(Person p, int age) {
		p.setAge(age);
	}
	
	public void birthDay(Person p) {
		p.setAge(p.getAge()+1);
	}
	
	public void getMarried(Person nameGiver, Person nameTaker) {
		nameTaker.setLastName(nameGiver.getLastName());
	}
	
	public void looseWeight(Person p, double weightLoss) {
		p.setWeight( p.getWeight() - weightLoss );
	}

}
