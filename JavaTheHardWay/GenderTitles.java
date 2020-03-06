import java.util.Scanner;

public class GenderTitles {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String title= "unknown"; //default title.

		System.out.print( "First name: " );
		String first = keyboard.next();
		System.out.print( "Last name: " );
		String last = keyboard.next();
		System.out.print( "Gender (M/F): " );
		String gender = keyboard.next();
		System.out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) {
			title = first;
		}
		else {
			if ( gender.equals("F") ) {
				System.out.print( "Are you married, "+first+"? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if ( gender.equals("M")) { //binary gender system
				title = "Mr.";
			}
		}

		System.out.println( "\n" + title + " " + last );
	}
}

	/*
	1. It originally didn't compile not only because of the variable being initiated, but
		because the line in the book is missing the curly brace to open the if statement and we had
		a mismatch. After that was fixed we got the variable not being initiated error message because
		there was an option for the variable to be called without ever being initiated and it originally
		held a null value.
	*/
