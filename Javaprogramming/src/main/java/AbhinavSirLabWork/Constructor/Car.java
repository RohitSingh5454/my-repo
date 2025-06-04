package Constructor;

public class Car {
    public static void main(String[] args) {
     Ferrari obj9=new Ferrari();
        obj9.BPO();
     obj9.a=67;
     obj9.str="Singh";

    }
}
class Ferrari{
    String str="Rohit";
    int a=98;
    void BPO(){
        System.out.println("Ho");
    }
   Ferrari(){
       System.out.println(str);
       System.out.println(a);
    }


}
