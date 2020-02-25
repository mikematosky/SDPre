import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();

    //I broke the second question with 'the ultimate question'
    //I broke the third input with 'o.2'
    /*
    Both of these blew up because the input expected is an int and a double,
    but I inputted a string of characters
    */
  }
}
