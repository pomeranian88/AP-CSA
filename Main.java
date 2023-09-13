import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Pythagorean calculator!");
    int side1 = 3;
    System.out.println("Side 1 length is: " + side1);
    int side2 = 3;
    System.out.println("Side 2 length is: " + side2);
    
    double hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    
    int value = hyp;
    
    System.out.print("The hypotenuse of this triangle is: " + hyp);
    
  }
}



