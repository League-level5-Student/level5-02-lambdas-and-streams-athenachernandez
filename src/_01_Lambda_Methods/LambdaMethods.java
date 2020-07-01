package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "backwards");
		
		System.out.println();
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(s.substring(i, i + 1).toUpperCase());
				} else {
					System.out.print(s.substring(i, i + 1).toLowerCase());
				}
			}
		}, "funky");
		System.out.println();
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + ".");
			}
		}, "period");
		
		System.out.println();
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				char current = s.charAt(i);
				if (current != 'a' && current != 'e' && current != 'i' && current != 'o' && current != 'u') {
					System.out.print(current);
				}
			}
		}, "vowels");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
