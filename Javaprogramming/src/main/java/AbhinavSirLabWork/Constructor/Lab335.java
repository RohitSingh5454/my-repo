package Constructor;

public class Lab335 {
    public static void main(String[] args) {
      MoK m1=new MoK();
      m1.P();
      MoK m2=new MoK(12,990550986,"Gajendra","Software developer");
      m2.P();
      MoK m3=new MoK(32,898264728,"Dhirendra");
      m3.P();
      MoK m4=new MoK(56,987123456);
      m4.P();
    }
}
class MoK{
   static int sid;
    long phoneNo;
    String sname;
    String occupation;

  MoK(int sid, long phoneNo, String sname, String occupation) {
        this.sid = sid;
        this.phoneNo = phoneNo;
        this.sname = sname;
        this.occupation = occupation;
    }

    public MoK(int sid, long phoneNo, String sname) {
        this.sid = sid;
       this. phoneNo = phoneNo;
        this.sname = sname;
    }

    public MoK(int sid, long phoneNo) {
        this.sid = sid;
        this.phoneNo = phoneNo;
    }

    public MoK() {
    }
    void P(){
        System.out.println("Result is : "+sname+" "+sid+" "+phoneNo+" "+occupation);
    }
}
