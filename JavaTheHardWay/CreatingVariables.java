public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );

    //new variables

    int newInt;
    double newDouble;
    String newString1, newString2;

    newInt= 4387;
    newDouble= 7.286;
    newString1= "May";
    newString2= "Radar";
    
    System.out.println();
    System.out.println("The value of my new integer is "+newInt);
    System.out.println("The value of my new double is "+newDouble);
    System.out.println("The first  new string is the only three lettere month: "+newString1);
    System.out.println("The second new string is the name of my awesome dog, "+newString2);

  }
}
