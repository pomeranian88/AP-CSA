import java.util.Scanner;

public class Calculate
{
    private int side1;
    private int side2;
    private double hyp;
    private final String name;
    private boolean tripleOrNot;

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
        makeHyp();
    }
    public void Increase(String n) {
        Scanner s = new Scanner(System.in);
        System.out.println(n + ", how much do you want to increase side1 by?: ");
        int increase = s.nextInt();
        side1 += increase;
        System.out.println("How much do you want to decrease side2 by?: ");
        int decrease = s.nextInt();
        for (int i = 0; i<decrease; i++){ // CHECK THIS OVER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            side2--;
        }
        makeHyp();
    }
    public void makeHyp(){
        hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        int value = (int) hyp; // cast hyp into an int to truncate it
        tripleOrNot = (hyp - value) == 0.0;
    }
    public void check(Triangle firstOne, Triangle secondOne){
        boolean aoiwdhoahwd = firstOne.equals(secondOne);
    }
    public boolean getTripleOrNot(){return tripleOrNot;}
    public double getHyp(){return hyp;}
    public int getSide1(){return side1;}
    public int getSide2(){return side2;}
    public String toString(){
        System.out.print("your final info: ");
        return "side1 = " + side1 + ", side2 = " + side2 + ", hyp = " + hyp + ", name = " + name;
    }
}
