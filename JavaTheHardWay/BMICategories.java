import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi;
		//Scanner keyboard = new Scanner(System.in);

		double m, kg; //bmi;
		double height, weight, inches; //could be added to above line.
		int feet;

		System.out.print("Your height (in feet): ");
		feet= keyboard.nextInt();
		System.out.print("Your additional inches of height: ");
		inches= keyboard.nextDouble();

		m= ((12*feet)+inches)/39.37; //convert height to meters

		System.out.print( "Your weight in lbs: " );
		weight = keyboard.nextDouble();

		kg= weight * 0.454;

		bmi = kg / (m*m);
		System.out.println( "Your BMI is " + bmi );


		//System.out.print( "Enter your BMI: " );
		//bmi = keyboard.nextDouble();

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
