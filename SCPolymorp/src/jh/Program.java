package jh;

public class Program {

	public static void main(String[] args) {
		UserErrors[] uE = new UserErrors[3];
		
		uE[0] = new NumericInputError();
		uE[1] = new TextInputError();
		uE[2] = new OutOfBoundsError(200, 400);
		
		for(UserErrors e : uE) {
			System.out.println(e.UEMessage());
		}
	}
}
