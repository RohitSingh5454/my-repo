package AbhinavSirLabWork.Exception;

public class Lab738 {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            Puppet p1=new Puppet();
            p1.getPupById("Jlc-00098");
            p1.getPupById("Rogit");
            p1.getPupById("Jlc-008");
        }catch (Exception ed){
            ed.printStackTrace();
           // System.out.println("Not matching");
        }
        System.out.println("main ends");

    }
}

class Puppet{
    String getPupById(String sid){
        if (sid==null || sid.isEmpty() || sid.equals("Jlc-008"))
            throw new DuplicateSuchElementException(sid);
        else
            return "srinivas";
    }

}
class DuplicateSuchElementException extends RuntimeException{
    DuplicateSuchElementException(String sid){
        super(sid);
    }
}
