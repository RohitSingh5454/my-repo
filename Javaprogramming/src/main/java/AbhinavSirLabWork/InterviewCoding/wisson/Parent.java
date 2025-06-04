package AbhinavSirLabWork.InterviewCoding.wisson;

public class Parent {
     Parent (String s){
            System.out.println("Parent Class Param  "+s);
        }
    }
    class Child extends Parent {

        Child (){

            this("Constructor");

            System.out.println("Child Class Default Constructor");

        }

        Child (String s){
            super("Hello");
            System.out.println("Child Class Param Constructor "+s);
        }

        public static void main(String[] args) {

            Child obj = new Child();

        }

}
