import java.util.Scanner;

public class Print
{
    private String name;
    Calculate clack = new Calculate();
    Scanner s = new Scanner(System.in);

    public void getName(){
        System.out.println("What's your name? ");
        name = s.next();
    }
    public int welcome(){
        System.out.println("Welcome to the Pythagorean Calculator!\n-------------------------");
        System.out.println("Would you like to\n1) Calculate the hypotenuse of a triangle\n2) Calculate the " +
                "slope between two points\n3) Quit because you didn't mean to open this");
        System.out.println("Enter 1, 2, or 3: ");
        return s.nextInt();
    }
    public void printTri() {
        clack = new Calculate(name);
        clack.getSides();
        clack.makeHyp();
        System.out.println("The hypotenuse of this triangle is: " + clack.getHyp());
        System.out.println("This triangle is a pythagorean triple: " + clack.getTripleOrNot()); // 2.6 PT.3
        System.out.println();

        clack.Increase(name);
        clack.makeHyp();
        System.out.println("After increasing side1 by that amount and decreasing side2 by that amount...");
        System.out.println("The hypotenuse of this triangle is: " + clack.getHyp());
        System.out.println("This triangle is a pythagorean triple: " + clack.getTripleOrNot());
    }
    public void printSlope() {
        Slope kack = new Slope();
        kack.getPoints();
        kack.calculateSlope();
        System.out.println("The distance between these points = " + kack.getHyp());
        System.out.println("The y intercept of this line is (0, " + kack.getYInt() + ")");
        System.out.println("The equation of this line is: y = " + kack.getSlope() + "x + " + kack.getYInt());
    }
    public void dothething(){
        System.out.println(clack);
    }
}
