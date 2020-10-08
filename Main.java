import java.util.Scanner;
/**
 * This program will create a box of stars depending on user's input
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a number between 1 ~ 10
    System.out.println("Please enter a number between 1 and 10");

    // Gets the number from the user
    int num = input.nextInt();

    // Using nested for loops it will print out an x amount of star for an x amount of time
    for(int i = 1; i <= num; i++){
      for(int j = 1; j <= num; j++){
        System.out.print("* ");
      }
      // Puts the stars in a different line so that it could create a box
      System.out.println();
    }
  }
}
