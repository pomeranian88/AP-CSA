import java.util.Scanner;

public class Print
{
    private String name; // 2.6 PT.1
    Calculate clack = new Calculate();

    public void getName(){
        System.out.println("What's your name? ");
        Scanner s = new Scanner(System.in);
        name = s.next();
    }
    public void print() {
        clack = new Calculate(name);
        clack.getSideOne();
        clack.getSideTwo();
        double hyp = clack.getHyp(); // calculate hypotenuse length
        int value = (int) hyp; // cast hyp into a int to truncate it
        boolean yon = (hyp - value) == 0.0; // if subtracting the double - the truncated yields 0.0, it's a pythag triple
        System.out.println("The hypotenuse of this triangle is: " + hyp);
        System.out.println("This triangle is a pythagorean triple: " + yon); // 2.6 PT.3
        System.out.println();
    }

    public void print2(){
        clack.Increase(this.name);
        int value = (int)clack.getHyp();
        boolean yon = (clack.getHyp() - value) == 0.0; // redo all these calculation
        System.out.println("After increasing side1 by that amount and decreasing side2 by that amount...");
        System.out.println("The hypotenuse of this triangle is: " + clack.getHyp());
        System.out.println("This triangle is a pythagorean triple: " + yon);
    }

    public void dothething(){
        System.out.println(clack);
    }
}
