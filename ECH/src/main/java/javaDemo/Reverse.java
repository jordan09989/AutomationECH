package javaDemo;

import java.util.Scanner;

public class Reverse {

	public static void main(String arg[]) {

		//reversewhile();
		//revrseFor();
		reverseTostringbulder();
		reversebuffer();

	}

	public static void reversewhile() {

		int num = 1234;
		int Reversed = 0;

		while (num != 0) {

			int wb = num % 10;

			Reversed = Reversed * 10 + wb;

			num /= 10;

		}

		System.out.println(" The string is reversed " + Reversed);
	}

	public static void revrseFor() {

		int num = 0;
		int Reversed = 0;

		System.out.println("Enter your number Press Enter");
		// to enter the value we use the scanner
		Scanner in = new Scanner(System.in);
		num = in.nextInt();

		for (; num != 0; num /= 10) {

			int wb = num % 10;

			Reversed = Reversed * 10 + wb;

		}
		System.out.println(" The forstring is reversed " + Reversed);
	}

	public static void reverseTostringbulder() {

		String num = "Janardan singh";

		StringBuilder str = new StringBuilder();

		str.append(num);

		System.out.println("Reverse string is   " + str.reverse());
	}
	public static void reversebuffer() {
		
		String num = "soni singh";
		
		StringBuffer str = new StringBuffer();
		
		str.append(num);
		
	System.out.println("The reverse file   "+str.reverse());
	}
}












