package AbhinavSirLabWork.Methods;

public class Lab357 {
    public static void main(String[] args) {
       Sir h=new Sir();
       h.Roz(22);
        System.out.println(h.age);


    }
}
class Sir{
    int age;
    void Roz(int age){
        this.age=age;
    }
}