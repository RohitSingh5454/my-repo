package Polymorphism;

public class Commando {
    public static void main(String[] args) {
        Marcos m=new Marcos();
        m.Black();
    }
}
class Nsg{
    String x="Rohit singh";
}
class Marcos extends Nsg{
    int a=98;
    void Black(){
        Marcos ref1=this;
        Nsg ref2=this;
        System.out.println(ref1.a);
        System.out.println(ref2.x);
    }
}
