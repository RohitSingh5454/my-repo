package Super;

public class ABC {
    public static void main(String[] args) {
        new INC().how();;
    }
}
class RJD{
    int a=97;
}
class INC extends RJD{
    int b=87;
    int a=89;
    void how(){
        int b=67;
        System.out.println(b);//67
        System.out.println(this.b);//87
        System.out.println(super.a);//97
        System.out.println(a);//89
    }
}
