package AbhinavSirLabWork.Methods.Overloading;

public class Lab390 {
    public static void main(String[] args) {
       Book obj=new Book();
       obj.np("hh");
       obj.np(obj);

    }
}
class Book{
    void np(String st) {
        System.out.println("np()");
    }
        void np(Object st){
            System.out.println("np() obj");

    }
}