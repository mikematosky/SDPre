import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);

    double m, kg, bmi;
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
  }
}

/*

*/
