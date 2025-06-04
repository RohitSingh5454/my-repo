package AbhinavSirLabWork.Super;

public class Lab448 {
    public static void main(String[] args) {
        new Sp(14);
    }
}
class Bp{
    Bp(){
        System.out.println("This is no argument constructor");
    }

}
class Sp extends Bp{
   Sp(){
        System.out.println("This is Bp no arg constructor");
    }
    Sp(int b){
        this();
        System.out.println("This is 1-arg constructor");
    }
}
