package InterviewPreparation.FunctionalInterface.MethodReference.ConstructorReference;

public interface Message {
    void m1(String st);
}
class Car{
    Car(String str){
        System.out.println(str);
    }

}
class Vehicle{
    public static void main(String[] args) {

    Message msg=Car::new;
    msg.m1("Howdy");

}}