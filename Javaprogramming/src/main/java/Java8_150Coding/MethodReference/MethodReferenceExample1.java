package Java8_150Coding.MethodReference;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Thread th=new Thread(MethodReferenceExample1::printMessage);
        th.start();
    }
    public static void printMessage(){
        System.out.println("Hello world");
    }
}
