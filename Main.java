import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] iHATETHIS){
    int choice = -1;
    String choice2 = "";
    ArrayList<Integer> studentsInts = new ArrayList<Integer>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Club> clubs = new ArrayList<Club>();
    
    Scanner s = new Scanner(System.in);
    System.out.println("Club Credit System!"); System.out.println("------------");
    while(true){
      System.out.print("Do you want to\n(1) Register\n(2) Sign in\n(3) Log into a club?");
      choice = s.nextInt();
      System.out.println("------------");
      
      if(choice==1){ // REGISTERING FOR AN ACCOUNT
        int tempOsis;
        String tempPass;
        String tempName;
        boolean slamdunk = true;
        System.out.print("Enter your osis: "); tempOsis = s.nextInt();
        System.out.print("Enter a password: "); tempPass = s.next();
        System.out.print("Enter your name: "); tempName = s.next();
        for(int i=0;i<studentsInts.size();i++){ // was sorted numerically for binary search, scrapped it though
          if(studentsInts.get(i)==tempOsis){
            System.out.println("This osis is already linked to an account!");
            i = Integer.MAX_VALUE-1;
            slamdunk = false;
          }
          if(slamdunk){
            if(studentsInts.get(i)>tempOsis){
              studentsInts.add(i, tempOsis); // OSIS now in studentsInts w corresponding student in students
              students.add(i, new Student(tempOsis, tempName, tempPass)); // student now in students w corresponding number in studentsInts
              i = Integer.MAX_VALUE-1; // end loop
              System.out.println("\nYour account has been registered!\n\n------------");
            }
            if(i==studentsInts.size()-1){
              studentsInts.add(tempOsis);
              students.add(new Student(tempOsis, tempName, tempPass));
              i = Integer.MAX_VALUE-1;
              System.out.println("\nYour account has been registered!\n\n------------");
            }
          }
        }
        if(studentsInts.size()==0){ // only for the first one
          studentsInts.add(tempOsis);
          students.add(new Student(tempOsis, tempName, tempPass));
          System.out.println("\nYour account has been registered!\n\n------------");
        }
      }
      
      else if(choice==2){ // SIGNING INTO AN ACCOUNT
        int tempOsis;
        String tempPass;
        boolean loggedIn;
        boolean weirdCheck = false;
        System.out.print("Enter your osis: "); tempOsis = s.nextInt();
        System.out.print("Enter a password: "); tempPass = s.next();
        for(int i=0;i<studentsInts.size();i++){
          if(studentsInts.get(i)==tempOsis){
            weirdCheck = true;
            loggedIn = students.get(i).logIn(tempOsis, tempPass);
            if(loggedIn == true){
              System.out.println("\n--------------"); System.out.println("  You're in!  "); System.out.println("--------------\n");
              while(loggedIn == true){
                System.out.println("Do you want to:"); 
                System.out.println(" 1) See your clubs & credits"); 
                System.out.println(" 2) Join a club");
                System.out.println(" 3) Make a club");
                System.out.println(" 4) Leave a club");
                System.out.println(" 5) Log out");
                choice = s.nextInt();
                
                if(choice==1){
                  System.out.println(students.get(i).getCreds(students.get(i)));
                }
                else if(choice==2){
                  boolean temptemp = false;
                  System.out.println("\nWhat's the name of the club you want to join? (make sure to spell correctly!)");
                  choice2 = s.next();
                  for(Club c : clubs){
                    if(c.getName().equals(choice2)){
                      students.get(i).joinClub(c, students.get(i));
                      System.out.println("\nClub has been joined!");
                      temptemp = true;
                    }
                  }
                  if(temptemp==false){
                    System.out.println("This club doesn't exist -- try spelling again");
                  }
                }
                else if(choice==3){
                  String tempNameClub = "";
                  int tempDayClub = 0;
                  String tempPassClub = "";
                  System.out.println("What's the super top secret password that no-one except the COSA knows?");
                  choice2 = s.next();
                  if(choice2.equals("pencil")){
                    System.out.println("Enter a name (all lowercase, one word): "); tempNameClub = s.next();
                    System.out.println("Enter a day (0 for Mon, 1 for Tues...): "); tempDayClub = s.nextInt();
                    System.out.println("Enter a top secret password: "); tempPassClub = s.next();
                    clubs.add(new Club(tempNameClub, tempDayClub, tempPassClub));
                    System.out.println("Club " + tempNameClub + " has been created!");
                  }
                }
                else if(choice==4){
                  String tempNameClub = "";
                  int thePointAtWhich = 0;
                  boolean temp = false;
                  System.out.println("What club do you want to leave?"); tempNameClub = s.next();
                  for(int j=0;j<clubs.size();j++){
                    if(clubs.get(j).getName().equals(tempNameClub)){
                      temp = true;
                      thePointAtWhich = j;
                    }
                  }
                  if(temp==true){
                    students.get(i).leaveClub(clubs.get(thePointAtWhich), students.get(i));
                    System.out.println("Club has been left!");
                  }
                  else{
                    System.out.println("That club doesn't exist -- try spelling again");
                  }
                }
                else if(choice==5){
                  loggedIn = false;
                  students.get(i).logOut();
                  System.out.println("\nLogged out!");
                }
                System.out.println("---------------------");
              }
            }
            else{System.out.println("Incorrect password!");
            System.out.println("---------------------");}
          }
        }
        if(weirdCheck==false){
          System.out.println("That OSIS is not linked to any account!");
        }
      }
      else if(choice==3){
        String tempName;
        String tempPass;
        boolean loggedIn;
        boolean weirdCheck = false;
        System.out.print("Enter your club's name (all lowercase, one word): "); tempName = s.next();
        System.out.print("Enter a password: "); tempPass = s.next();
        for(Club c : clubs){
          loggedIn = c.logIn(tempName, tempPass);
          if(loggedIn==true){
            weirdCheck = true;
            System.out.println("\n--------------"); System.out.println("- You're in! -"); System.out.println("--------------\n");
            while(loggedIn==true){
              System.out.println("Do you want to:"); 
              System.out.println(" 1) See all clubs & credits"); 
              System.out.println(" 2) Add/remove hours for a specific person");
              System.out.println(" 3) Log out");
              choice = s.nextInt();
              
              if(choice==1){
                System.out.println();
                c.seeAll();
              }
              else if(choice==2){
                int tempOsis = 0;
                int tempAdd = 0;
                System.out.println("Enter an osis:"); tempOsis = s.nextInt();
                System.out.println("Enter how much you're changing total hours by (enter a negative to remove hours): "); tempAdd = s.nextInt();
                for(int i=0;i<studentsInts.size();i++){
                  if(studentsInts.get(i)==tempOsis){
                    c.change(students.get(i), tempAdd);
                  }
                }
              }
              else if(choice==3){
                loggedIn = false;
                c.logOut();
              }
              System.out.println("---------------------\n");
            }
          }
        }
        if(weirdCheck==false){
          System.out.println("Incorrect name or password!");
        }
      }
      else if(choice==371955){
        System.out.println("Enter the top secret password: ");
        String choicetwenty = s.next();
        if(choicetwenty.equalsIgnoreCase("thankyoumasamune")){
          for(Club c : clubs){
            System.out.println("\n-----" + c.getName() + "-----\n");
            c.seeAll(choicetwenty);
          }
        }
      }
    }
  }
}
