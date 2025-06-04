package AbhinavSirLabWork.Oops;

public class Lab420 {
    public static void main(String[] args) {
      Suzuki ob1=new Suzuki();
      ob1.m1();
      ob1.m2();
    }
}
class Verna{
    int a=78;
    public void m1(){
        System.out.println("verna->m1 "+a);
       // System.out.println("verna->m1 "+b); // error not able to inherit child properties
    }
}
class Suzuki extends Verna{
    int b=57;
    public void m2(){
        System.out.println("Suzuki->m2 "+a);
        System.out.println("Suzuki->m2 "+b);
    }
}
