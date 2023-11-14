import java.util.Scanner;

public class Calculate
{
    private int side1;
    private int side2;
    private double hyp;
    private double hypOriginal;
    private final String name;
    private boolean tripleOrNot;
    private double count = 1;
    private boolean hypEquals;

    public Calculate(){
        name = "User";
    }

    public Calculate(String n){
        name = n;
    }

    public void getSides() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Pythagorean calculator, " + name + "!\nEnter side 1:");
        side1 = s.nextInt();
        System.out.println("Enter side 2: ");
        side2 = s.nextInt();
    }

    public void Increase(String n) {
        Scanner s = new Scanner(System.in);
        System.out.println(n + ", how much do you want to increase side1 by?: ");
        int increase = s.nextInt();
        side1 += increase;
        System.out.println("How much do you want to decrease side2 by?: ");
        int decrease = s.nextInt();
        side2 -= decrease;
        makeHyp();
    }
    public void makeHyp(){
        hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        int value = (int) hyp; // cast hyp into an int to truncate it
        tripleOrNot = (hyp - value) == 0.0; // if subtracting the double - the truncated yields 0.0, it's a pythag triple
        if (count == 1){
            hypOriginal = hyp;
            count = 2;
        }
        if (!(count > 2) && !(count < 2)){ // 3.5 incredibly convoluted way of getting LOGICAL OPERATORS !!
            if (hypOriginal == hyp){ // 3.5 NESTED IF STATEMENTS !!
                hypEquals = true;
            }
            else {
                hypEquals = false;
            }
        }
    }
    public boolean getTripleOrNot(){return tripleOrNot;}
    public double getHyp(){return hyp;}
    public boolean getHypEquals(){return hypEquals;}
    public String toString(){
        System.out.print("your final info: ");
        return "side1 = " + side1 + ", side2 = " + side2 + ", hyp = " + hyp + ", name = " + name;
    }
}
