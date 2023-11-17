public class Triangle {
    private int side1;
    private int side2;
    private double hyp;

    public Triangle(int s, int n, double h) {
        side1 = s;
        side2 = n;
        hyp = h;
    }

    public boolean equals(Triangle t) { // 3.7 comparing objects
        if (t.hyp == hyp) {
            if((t.side1 == side1) || (t.side1 == side2)){
                if((t.side2 == side1) || t.side2 == side2){ // 3.5 nested if and logical operators
                    return true;
                }
                return false;
            }
            return false;
        }
        else {
            return false;
        }
    }
}
