package AbhinavSirLabWork.Methods;

public class Lab365 {
    public static void main(String[] args) {
        Kop obn=new Kop();
       int c= obn.Vop(34);
        System.out.println(c);

    }
}
class Kop{
    int Vop(int x){
        System.out.println("Vop() method");
        return x*10;
    }
}
