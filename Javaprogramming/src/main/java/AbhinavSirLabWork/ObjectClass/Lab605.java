package AbhinavSirLabWork.ObjectClass;

public class Lab605 {
    public static void main(String[] args) {
      Student8 stud8=new Student8(12,"Kamal");
        System.out.println(stud8);
    }
}
class Student8{
    int id;
    String sname;
    Student8(int id,String sname){
        this.id=id;
        this.sname=sname;
    }
    public String toString(){
        return id+" "+sname;
    }
}
