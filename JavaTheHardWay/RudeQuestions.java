import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, fav_color;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.println("What is your favorite color, "+ name+ "?");
    fav_color = keyboard.next();

    System.out.println(fav_color+ " is a great color!");


    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    /*
      1. It does not blow up if you enter an integer while you are expecting a double
      2. It does not blow up if you enter a number while you are expecting a string.
        I'm not 100% sure about this, but I believe the underlying fault of this is That
        when you allocate memory for different types each type uses a different size
        and the information you're trying to store does not fit into that memory size.
        String> Double > Int. So you can store an int as a double or a String, but you
        cannot work the other way around. Java uses this in their static typing to
        protect the hardware from these issues.
      3. String cannot blow up. Integer crashes on a string/char, double, or a very large number.
        Double crashes on a very large number or a string/char.
    */

  }
}
