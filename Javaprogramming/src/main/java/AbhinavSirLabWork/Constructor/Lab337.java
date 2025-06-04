package AbhinavSirLabWork.Constructor;

public class Lab337 {
    public static void main(String[] args) {
        Student1 obj=new Student1(4,"sushant");
        obj.show();
    }
}
class Student1{
   int sid;
   String sname;
   Student1(int id,String sn) {
       this.sid = id;
       this.sname = sn;
       System.out.println("this is argument constructor");
   }
       Student1() {
           System.out.println("this is no argument");
       }
       void show(){
           System.out.println(sid+" "+sname);
   }
}
