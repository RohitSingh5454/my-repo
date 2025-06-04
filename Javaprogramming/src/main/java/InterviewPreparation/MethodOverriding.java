package InterviewPreparation;

public class MethodOverriding {
    public static void main(String[] args) {
        X obj1=new X(2,"Rishav ");
        System.out.println(obj1);

    }
}
class X{
    int id;
    String name;
    X(int id,String name){
        this.id=id;
        this.name=name;
    }
}
