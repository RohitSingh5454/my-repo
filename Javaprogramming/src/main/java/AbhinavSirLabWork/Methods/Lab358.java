package AbhinavSirLabWork.Methods;

public class Lab358 {
    public static void main(String[] args) {
     Student1 h=new Student1();
     h.B2(33);
        System.out.println(h.a);
    }
}
class Student1{
    int a=23;
    void B2(int a){
       if(a<22) //33<22
          return;
       this.a=a;
    }
}