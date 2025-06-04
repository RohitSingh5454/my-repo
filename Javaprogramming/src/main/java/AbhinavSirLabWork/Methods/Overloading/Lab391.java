package AbhinavSirLabWork.Methods.Overloading;

public class Lab391 {
    public static void main(String[] args) {
         Car on=new Car();
         on.Show("Soman");
         on.Show(on);
    }
}
class Car{
    void Show(String str){
        System.out.println("Show(String)");
    }
    void Show(Car ob){
        System.out.println("Show(Car)");
    }
}
