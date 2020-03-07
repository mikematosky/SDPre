import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection ==1 ){
        System.out.println("Hello Human");
      }
      else if(selection ==2){
        System.out.println("Pierogies, Rice Krispy Treats, Girl Scout Tagalongs, Pizza");
      }
      else if(selection ==3){
        System.out.println("Goodbye Human");
        break; //I was really surprised that this worked
      }
      else
        System.out.println("You gone and messed up big time A-Aron");

      /*
      Your solution goes here
      */
    }

    scanner.close();
  }
}
