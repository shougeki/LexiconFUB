package jh;

public class Program {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		
		Worm wo = new Worm();
		wo.setMaxDepth(200);
		
		animals[0] = new Horse();
		animals[1] = new Dog();
		animals[2] = new Worm();
		animals[3] = wo;
		
		for( Animal a : animals) {
			if(a==null) break;
			System.out.println( a.getAnimalName() );
			
			//System.out.println( a.getClass());
			//System.out.println( a.toString());
		}
		
		// Dog[] dogs = new Dog[10];
		// Type mismatch, cannot convert from Horse to Dog
		// A horse is a horse, ofcourse
		// dogs[0] = new Horse();
		
		Animal bird1 = new Flamingo();
		Bird bird2 = new Pelican();
		
		System.out.println( bird1.getAnimalName() );
		System.out.println( bird2.getAnimalName() );
	}
}
