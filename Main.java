public class Main
{
  public static void main(String[] args)
  {
    Print start = new Print();
    start.getName();
    int choice = start.welcome();
    if (choice==1) {
      start.printTri();
    }
    else if (choice==2){
      start.printSlope();
    }
    else {
      System.out.println("weirdo!");
    }
  }
}
