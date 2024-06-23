import java.util.ArrayList;

public class Student{
  private int osis;
  private String name;
  private String pass;
  private boolean loggedIn;
  private ArrayList<Club> clubsImIn = new ArrayList<Club>();
  private int[] creds;
  private int[] hours;
  private String total;
  
  public Student(int o, String n, String p){
    osis = o; name = n; pass = p;
  }
  public boolean logIn(int o, String p){
    if(o==osis && p.equals(pass)){
      loggedIn = true; return true;
    }
    loggedIn = false; return false;
  }
  public void logOut(){loggedIn = false;}
  public String getCreds(Student me){
    if(loggedIn){
      total = "\n" + name + "'s credits!\n---------------\n";
      creds = new int[clubsImIn.size()];
      hours = new int[clubsImIn.size()];
      for(int i=0;i<creds.length;i++){
        creds[i] = clubsImIn.get(i).getHours(me);
      }
      for(int i=0;i<hours.length;i++){
        hours[i] = clubsImIn.get(i).getCreds(me);
      }
      for(int i=0;i<clubsImIn.size();i++){
        total += clubsImIn.get(i).getName() + ": " + creds[i] + " credits, " + hours[i] + " total hours\n";
      }
      return total;
    }
    else{return "stop trying to hack in";}
  }
  public void joinClub(Club c, Student s){
    if(loggedIn){
      boolean temp = false;
      for(Club cack : clubsImIn){
        if(cack.equals(c)){
          System.out.println("You're already in this club!");
          temp = true;
        }
      }
      if(temp==false){
        clubsImIn.add(c);
        c.addMember(s);
      }
    }
    else{System.out.println("stop trying to hack in");}
  }
  public void leaveClub(Club c, Student s){
    if(loggedIn){
      boolean temp = false;
      for(Club cack : clubsImIn){
        if(cack.equals(c)){
          temp = true; // you are in the club
        }
      }
      if(temp==true){
        for(int i=0;i<clubsImIn.size();i++){
          if(clubsImIn.get(i).equals(c)){
            clubsImIn.remove(i);
            c.leaveClub(s);
          }
        }
      }
      else{
        System.out.println("You're not in that club!");
      }
    }
    else{System.out.println("stop trying to hack in");}
  }
  public void log(int hours, Club c, Student me){
    if(loggedIn){
      c.log(me, hours);
    }
    else{System.out.println("stop trying to hack in");}
  }
  public String getName(){return name;}
  public int getOsis(){return osis;}
}
