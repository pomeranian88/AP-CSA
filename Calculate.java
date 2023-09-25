import java.util.Scanner;

public class Calculate
{
    private int side1;
    private int side2;

    public double getSideOne() {
        System.out.println("Welcome to the Pythagorean calculator!");
        System.out.println("Enter side 1: ");
        Scanner s = new Scanner(System.in);
        int side1 = s.nextInt(); // get side 1 length
        return side1;
    }

    public double getSideTwo() {
        System.out.println("Enter side 2: ");
        Scanner s = new Scanner(System.in);
        int side2 = s.nextInt(); // get side 2 length
        double hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)); // calculate hypotenuse length
        return side2;
    }

    public double Increase(double side1, double side2) {
        System.out.println("How much do you want to increase side1 by?: ");
        Scanner s = new Scanner(System.in);
        int increase = s.nextInt();
        side1 += increase; // increase side1 by specified amount
        System.out.println("How much do you want to decrease side2 by?: ");
        s = new Scanner(System.in);
        int decrease = s.nextInt();
        side2 -= decrease;
        double hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));

        return hyp;
    }
}
