import java.util.Scanner;


public class Print
{
    private String name;
    private int value;
    private boolean yon;
    Calculate clack = new Calculate();
    Scanner s = new Scanner(System.in);


    public void getName(){
        System.out.println("What's your name? ");
        name = s.next();
    }
    public int welcome(){
        System.out.println("-------------------------");
        System.out.println("Would you like to\n1) Calculate the hypotenuse of a triangle\n2) Calculate the slope between two points");
        System.out.println("Enter 1 or 2: ");
        return s.nextInt();
    }
    public void printTri() {
        clack = new Calculate(name);
        clack.makeSideOne();
        clack.makeSideTwo();
        double hyp = clack.getHyp(); // calculate hypotenuse length
        value = (int) hyp; // cast hyp into an int to truncate it
        yon = (hyp - value) == 0.0; // if subtracting the double - the truncated yields 0.0, it's a pythag triple
        System.out.println("The hypotenuse of this triangle is: " + hyp);
        System.out.println("This triangle is a pythagorean triple: " + yon); // 2.6 PT.3
        System.out.println();


        clack.Increase(name);
        value = (int)clack.getHyp();
        yon = (clack.getHyp() - value) == 0.0; // redo all these calculation
        System.out.println("After increasing side1 by that amount and decreasing side2 by that amount...");
        System.out.println("The hypotenuse of this triangle is: " + clack.getHyp());
        System.out.println("This triangle is a pythagorean triple: " + yon);
    }
    public void printSlope() {
        Slope kack = new Slope();
        System.out.println("-------------------------");
        kack.getPoints();
        kack.calculateSlope();
    }
    public void dothething(){
        System.out.println(clack);
    }
}
