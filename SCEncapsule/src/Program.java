
public class Program {
	
	public static void main(String arg[]) {
		
		//Person p = new Person();
		
		// The field Person.age is not visible (2 quick fixes)
		// Det är inte möjligt att accessa privata variabler via punktnotation
		// p.age = 20;
		
		/*
		 
		PersonHandler ph = new PersonHandler();
		Person p;
		
		p = ph.CreatePerson(25, "Johan", "Häggqvist", 183.0, 98.0);
		ph.SetAge(p, 40);
		
		*/
		
		
		PersonHandler pH = new PersonHandler();
		Person[] pA = new Person[10];
		
		pA[0] = pH.CreatePerson(25, "Johan", "Häggqvist", 183.0, 98.0);
		pA[1] = pH.CreatePerson(35, "Kalle", "Boll", 174.0, 88.0);
		pA[2] = pH.CreatePerson(55, "Bengt", "Berg", 156.0, 78.0);
		pA[3] = pH.CreatePerson(29, "Svenne", "Svensson", 190.0, 128.0);

		
		for(int i=0; pA[i] != null;i++) {
			pH.birthDay(pA[i]);
		}
		
		System.out.println(pA[0].getAge());
		System.out.println(pA[1].getAge());
		System.out.println(pA[2].getAge());
		
		
		
		
	}
}
