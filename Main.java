public class Main
{
  public static void main(String[] args)
  {
    Print start = new Print();
    start.getName();
    if (start.welcome() == 1) {
      start.printTri();
    }
    else {
      start.printSlope();
    }
  }
}
