package AbhinavSirLabWork.Super;

public class Lab446 {
    public static void main(String[] args) {
        new Sbi();
    }
}
class Bank{
    Bank(int a){
        System.out.println("A (int) cons");
    }
}
class Sbi extends Bank{
    Sbi(){
        super(10);
        System.out.println("Sbi->D.C");
    }
}
