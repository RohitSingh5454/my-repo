package AbhinavSirLabWork.InterviewCoding.capgemini;

public class Xyz {
    static int i;
    public static void main(String[] args) {
        Xyz.i = Xyz.i + 10;
        Xyz obj1 = new Xyz();
        obj1.i = obj1.i + 10;
        System.out.println(Xyz.i);
        System.out.println(obj1.i);  //10
    }
    }
    // output 20 20

