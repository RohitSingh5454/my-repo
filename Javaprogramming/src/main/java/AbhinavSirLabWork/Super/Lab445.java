package Super;

public class Lab445 {
    public static void main(String[] args) {
        new Truck();

    }
}
class Bus{
    Bus(int a){
        System.out.println("This is 1-arg constructor");
    }
}
class Truck extends Bus{
    Truck(){
        super(12);// super(12);//super();->error and call to super must be first member in constructor
        System.out.println("This is Default constructor");

    }


}
