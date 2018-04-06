package johan.codealong;

import java.io.*;

public class CodeAlong {

	public static void main(String[] args) throws IOException {

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			Person person = new Person();

			System.out.println("Enter your first name:");
			person.setFirstName(inputReader.readLine());

			System.out.println("Enter your last name:");
			person.setLastName(inputReader.readLine());

			System.out.println("Enter your age:");

			try {
				person.setAge(Integer.parseInt(inputReader.readLine()));
			} catch (NumberFormatException e) {
				System.out.println("Illegal Age detected!");
				person.setAge(9999);
			}

			System.out.println("Enter your Occupation:");
			person.setOccupation(inputReader.readLine());

			printPersonInformation(person);

			System.out.println(getPriceFromAgeSuffix(getAgeSuffix(person.getAge())));
		}
	}

	private static char getAgeSuffix(int age) {

		if (age >= 65)
			return 'S';
		if (age > 15)
			return 'A';
		return 'J';
	}

	private static String getPriceFromAgeSuffix(char ageSuffix) {

		switch (ageSuffix) {
		case 'J':
			return "You are under 15 and will pay a Junior Price";
		case 'A':
			return "You will pay full price";
		case 'S':
			return "You are retired and wil pay a reduced price";
		default:
			return "Are you even human?";
		}
	}

	private static void printPersonInformation(Person person) {

		System.out.format("Name: %1$s%nAge: %2$d%nOccupation: %3$s%n", person.getFullName(), person.getAge(),
				person.getOccupation());
	}
}
