package Java8_150Coding;


public interface AddTwoNumber {
    void abstractAdd(int a, int b);
   default void Print(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        AddTwoNumber ob1=(a,b)-> System.out.println(a+b);
        ob1.abstractAdd(23,34);
    }
}
