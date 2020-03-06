import java.util.Scanner;

public class Objective4Lab4 {
  public static void main (String[] args){
    int num;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    num= input.nextInt();

    System.out.print("The number is ");

    if(num % 2== 0)
      System.out.print("even.\n");
    else
      System.out.print("odd.\n");

  }
}
