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


    public void makeSideOne() {
        System.out.println("-------------------------\nWelcome to the Pythagorean calculator, " + name + "!\nEnter side 1:"); // 2.6 PT.2&4
        Scanner s = new Scanner(System.in);
        side1 = s.nextInt(); // get side 1 length
    }


    public void makeSideTwo() {
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
    public double getHyp(){
        hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        return this.hyp;
    }
    public String toString(){
        System.out.print("your final info: ");
        return "side1 = " + side1 + ", side2 = " + side2 + ", hyp = " + hyp + ", name = " + name;
    }
}
