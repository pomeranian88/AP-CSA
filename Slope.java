import java.util.Scanner;

public class Slope {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double slope;
    private double yInt;
    private double hyp;

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
        slope = (y2 - y1) / (x2 - x1);
        System.out.print("The slope between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is ");
        System.out.println(slope);
        yInt = (y2 - (slope *Math.abs(x2)));
        hyp = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }
    public void getMorePoints(){
        System.out.println("\nHere are some more points in your line:");
        for(int i=0;i<5;i++){
            for(int j=1;j<3;j++){
                System.out.println("(" + (x2 + j+i) + ", " + (y2 + j+(i*slope)) + ")"); //4.4 nested iteration
            }
            i++;
        }
    }
    public double getSlope(){return slope;}
    public double getYInt(){return yInt;}
    public double getHyp(){return hyp;}

}
