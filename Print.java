public class Print
{
    Calculate clack = new Calculate();

    public void print() {
        double side1 = clack.getSideOne();
        double side2 = clack.getSideTwo();
        double hyp = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)); // calculate hypotenuse length
        int value = (int)hyp; // cast hyp into a int to truncate it
        boolean yon = (hyp - value) == 0.0; // if subtracting the double - the truncated yields 0.0, it's a pythag triple
        System.out.println("The hypotenuse of this triangle is: " + hyp);
        System.out.println("This triangle is a pythagorean triple: " + yon);
        System.out.println();

        hyp = clack.Increase(side1, side2);
        value = (int)hyp;
        yon = (hyp - value) == 0.0; // redo all these calculation
        System.out.println("After increasing side1 by that amount and decreasing side2 by that amount...");
        System.out.println("The hypotenuse of this triangle is: " + hyp);
        System.out.println("This triangle is a pythagorean triple: " + yon);
    }
}
