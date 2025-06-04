package AutoBoxing;

public class Lab684 {
    public static void main(String[] args) {
        Void v=null;
        Service.show(null);
        Service.show(v);
    }
}
class Service{
    static void show(Void v){
        System.out.println("Show(void)");
    }
}
