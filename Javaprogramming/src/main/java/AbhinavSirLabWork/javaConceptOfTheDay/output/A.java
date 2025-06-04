package AbhinavSirLabWork.javaConceptOfTheDay.output;

public class A {
        static void staticMethod()
        {
            System.out.println("Static Method");
        }
    }

     class MainClass
    {
        public static void main(String[] args)
        {
            A a = null;

            a.staticMethod();
        }
    }

