package AbhinavSirLabWork.InfosysInterviewPreparation;

public interface numericTest {
    boolean test(int c,int y);
}
class Gfg{
    public static void main(String[] args) {
        numericTest n1=(x,y)->x%y==0;
        if (n1.test(48,24)){
            System.out.println("24 is the factor of 48");
        }
        if (!n1.test(72,24)){
            System.out.println("48 is not the factor of 72");
        }
    }
}
