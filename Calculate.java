import java.util.Scanner;

public class Calculate
{
    private int side1;
    private int side2;
    private double hyp;
    private final String name;

    public Calculate(){
        name = "User";
    }

    public Calculate(String n){
        name = n;
    }

    public void getSideOne() {
        System.out.println("Welcome to the Pythagorean calculator, " + name + "!");
        System.out.println("Enter side 1: ");
        Scanner s = new Scanner(System.in);
        side1 = s.nextInt(); // get side 1 length
    }

    public void getSideTwo() {
        System.out.println("Enter side 2: ");
        Scanner s = new Scanner(System.in);
        side2 = s.nextInt(); // get side 2 length
    }

    public void Increase(String n) {
        System.out.println(n + ", how much do you want to increase side1 by?: ");
        Scanner s = new Scanner(System.in);
        int increase = s.nextInt();
        side1 += increase; // increase side1 by specified amount
        System.out.println("How much do you want to decrease side2 by?: ");
        s = new Scanner(System.in);
        int decrease = s.nextInt();
        side2 -= decrease;
        hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
    public void Increase() {
        System.out.println("User, how much do you want to increase side1 by?: ");
        Scanner s = new Scanner(System.in);
        int increase = s.nextInt();
        this.side1 += increase; // increase side1 by specified amount
        System.out.println("How much do you want to decrease side2 by?: ");
        s = new Scanner(System.in);
        int decrease = s.nextInt();
        this.side2 -= decrease;
        hyp = Math.sqrt(Math.pow(this.side1,2) + Math.pow(this.side2,2));
    }
    public double getHyp(){
        hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        return this.hyp;
    }
}
