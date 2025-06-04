package AbhinavSirLabWork.javaConceptOfTheDay.psuedoCode;

public class C {
    static int i=1111;
    static {
        i=i-- - --i; // 2
    }
    {
        i=i++ + ++i; // 2223
    }
}
class D extends C{
    static {
        i=--i - i--; //2222-2223
    }
    {
        i=++i + i++; //
    }
}
class main{
    public static void main(String[] args) {
        D ob=new D();
        System.out.println(ob.i);
    }
}

