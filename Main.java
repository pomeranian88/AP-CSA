import java.lang.Math;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Pythagorean calculator!");
    System.out.println("Enter side 1: ");
    Scanner s = new Scanner(System.in);
    int side1 = s.nextInt(); // get side 1 length
    System.out.println("Enter side 2: ");
    s = new Scanner(System.in);
    int side2 = s.nextInt(); // get side 2 length
    double hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)); // calculate hypotenuse length
    
    int value = (int)hyp; // turn hyp into a int to truncate it
    boolean yon = (hyp - value) == 0.0; // if subtracting the double - the truncated yields 0.0, it's a pythag triple
    
    System.out.println("The hypotenuse of this triangle is: " + hyp);
    System.out.println("This triangle is a pythagorean triple: " + yon);
    System.out.println("");
    
    System.out.println("How much do you want to increase side1 by?: ");
    s = new Scanner(System.in);
    int increase = s.nextInt();
    side1 += increase; // increase side1 by specified amount
    System.out.println("How much do you want to decrease side2 by?: ");
    s = new Scanner(System.in);
    int decrease = s.nextInt();
    for (int i = 0; i < decrease; i++) {
      side2--; // increase side2 "decrease" times by 1
    }
    
    hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    value = (int)hyp;
    yon = (hyp - value) == 0.0; // redo all these calculations
    
    System.out.println("After increasing side1 by that amount and decreasing side2 by that amount...");
    System.out.println("The hypotenuse of this triangle is: " + hyp);
    System.out.println("This triangle is a pythagorean triple: " + yon);
    
  }
}