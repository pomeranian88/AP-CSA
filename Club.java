import java.util.ArrayList;

public class Club{
  private String name;
  private int dayOfMeeting;
  private String pass;
  private boolean loggedIn;
  private ArrayList<Student> students = new ArrayList<Student>();
  private ArrayList<Integer> studentsCreds = new ArrayList<Integer>();
  private ArrayList<Integer> studentsHours = new ArrayList<Integer>();
  
  public Club(String n, int d, String p){
    name = n; dayOfMeeting = d; pass = p;
  }
  public boolean logIn(String n, String p){
    if(pass.equals(p) && name.equals(n)){
      loggedIn = true; return true;
    }
    loggedIn = false; return false;
  }
  public void logOut(){loggedIn = false;}
  public int getCreds(Student me){
    for(int i=0;i<students.size();i++){
      if(me.equals(students.get(i))){
        return studentsCreds.get(i);
      }
    }
    return -1;
  }
  public int getHours(Student me){
    for(int i=0;i<students.size();i++){
      if(me.equals(students.get(i))){
        return studentsHours.get(i);
      }
    }
    return -1;
  }
  public void addMember(Student me){
    students.add(me);
    studentsCreds.add(0);
    studentsHours.add(0);
  }
  public void log(Student me, int hours){
    if(loggedIn){
      for(int i=0;i<students.size();i++){
        if(me.equals(students.get(i))){
          studentsHours.set(i, hours + studentsHours.get(i));
          if(studentsHours.get(i)>=40){studentsCreds.set(i, 8);}
          else if(studentsHours.get(i)>=35){studentsCreds.set(i, 7);}
          else if(studentsHours.get(i)>=30){studentsCreds.set(i, 6);}
          else if(studentsHours.get(i)>=25){studentsCreds.set(i, 5);}
          else if(studentsHours.get(i)>=20){studentsCreds.set(i, 4);}
          else if(studentsHours.get(i)>=15){studentsCreds.set(i, 3);}
          else if(studentsHours.get(i)>=10){studentsCreds.set(i, 2);}
          else if(studentsHours.get(i)>=5){studentsCreds.set(i, 1);}
          else if(studentsHours.get(i)>=0){studentsCreds.set(i, 0);}
        }
      }
    }
    else{System.out.println("stop trying to break in");}
  }
  public void change(Student me, int hours){
    if(loggedIn){
      for(int i=0;i<students.size();i++){
        if(me.equals(students.get(i))){
          studentsHours.set(i, hours + studentsHours.get(i));
          if(studentsHours.get(i)>=40){studentsCreds.set(i, 8);}
          else if(studentsHours.get(i)>=35){studentsCreds.set(i, 7);}
          else if(studentsHours.get(i)>=30){studentsCreds.set(i, 6);}
          else if(studentsHours.get(i)>=25){studentsCreds.set(i, 5);}
          else if(studentsHours.get(i)>=20){studentsCreds.set(i, 4);}
          else if(studentsHours.get(i)>=15){studentsCreds.set(i, 3);}
          else if(studentsHours.get(i)>=10){studentsCreds.set(i, 2);}
          else if(studentsHours.get(i)>=5){studentsCreds.set(i, 1);}
          else if(studentsHours.get(i)>=0){studentsCreds.set(i, 0);}
          System.out.println(students.get(i).getName() + " now has " + studentsCreds.get(i) + " credits & " + studentsHours.get(i) + " total hours.\n");
        }
      }
    }
    else{System.out.println("stop trying to break in");}
  }
  public void seeAll(){
    if(loggedIn){
      for(int i=0;i<students.size();i++){
        System.out.println(students.get(i).getName() + " (" + students.get(i).getOsis() + ") has " + studentsCreds.get(i) + " credits & " + studentsHours.get(i) + " total hours.");
      }
    }
    else{System.out.println("stop trying to break in");}
  }
  public void seeAll(String topSecretPass){
    if(topSecretPass.equalsIgnoreCase("thankyoumasamune")){
      for(int i=0;i<students.size();i++){
        System.out.println(students.get(i).getName() + " (" + students.get(i).getOsis() + ") has " + studentsCreds.get(i) + " credits & " + studentsHours.get(i) + " total hours.");
      }
      System.out.println("\n----------------\n");
    }
    else{System.out.println("stop trying to break in");}
  }
  public void leaveClub(Student s){
    for(int i=0;i<students.size();i++){
      if(students.get(i).equals(s)){
        students.remove(i);
        studentsCreds.remove(i);
        studentsHours.remove(i);
      }
    }
  }
  public String getName(){return name;}
}
