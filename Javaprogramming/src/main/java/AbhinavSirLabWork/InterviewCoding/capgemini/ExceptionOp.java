package AbhinavSirLabWork.InterviewCoding.capgemini;

public class ExceptionOp{
    public static void main(String args[]){
        int output = m1();
        System.out.println(output);

    }
    public static int m1() {
        System.out.println("stmt1");

        try {
            System.out.println("stmt2");
            throw new Exception();
        } catch(Exception e){
            System.out.println("stmt3");
            return 3;
        } finally {
            System.out.println("stmt4");
            return 4;
        }
    }
}
