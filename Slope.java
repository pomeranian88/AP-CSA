import java.util.Scanner;


public class Slope {
    private double x1;
    private double x2;
    private double y1;
    private double y2;


    public void getPoints() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = s.nextInt();
        System.out.println("Enter y1:");
        y1 = s.nextInt();
        System.out.println("Enter x2:");
        x2 = s.nextInt();
        System.out.println("Enter y2:");
        y2 = s.nextInt();
    }
    public void calculateSlope() {
        double slope = (y2 - y1) / (x2 - x1);
        System.out.print("The slope between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is ");
        System.out.println(slope);
        boolean pon = (slope > 0.0);
        double yInt = (y2 - (slope *Math.abs(x2)));
        System.out.println("This line has a positive slope: " + pon);
        System.out.println("The y intercept of this line is " + yInt);
        System.out.println("The equation of this line is: y = " + slope + "x + " + yInt);
    }
}
