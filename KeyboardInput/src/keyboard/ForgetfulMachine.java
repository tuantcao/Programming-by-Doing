package keyboard;

import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Give me a word!");
		keyboard.next();

		System.out.println("Give me a second word!");
		keyboard.next();

		System.out.println("Great, now your favorite number?");
		keyboard.nextInt();

		System.out.println("And your second-favorite number...");
		keyboard.nextInt();

		System.out.println("Whem! Wasn't that fun?");
	}

}