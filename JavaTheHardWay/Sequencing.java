import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {
    // 2. THIS CODE IS NO LONGER BROKEN but I don't like how atom views the double
    // variables after the =0.

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print( "How much is the purchase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total );

    /*
      1. It throws an error for not being initialized because the cannot use a
      variable when the variable is holding a null value.
      3. It still compiles because price is initialized by the keyboard input. 
    */
  }
}
