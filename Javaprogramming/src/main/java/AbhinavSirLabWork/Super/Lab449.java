package AbhinavSirLabWork.Super;

public class Lab449 {
    public static void main(String[] args) {
        House obj=new House(10,"Klp");
        obj.show();
    }
}
class plot{
   static int a1;
    plot(int a1){
        System.out.println("plot->D.C");
        this.a1=a1;
    }
}
class House extends plot{
   public
   String a2;
    House(int a,String a2){
        super(a);
        this.a2=a2;
    }
    void show(){
        System.out.println(this.a2);
        System.out.println(super.a1);
    }
}
