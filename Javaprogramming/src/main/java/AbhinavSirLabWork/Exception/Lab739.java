package AbhinavSirLabWork.Exception;

public class Lab739 {
    public static void main(String[] args){
        System.out.println("Main started");
        try {
            StudentService1 studentService1=new StudentService1();
            studentService1.getNameBySid(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main ends");
    }
}
class StudentService1{
    String getNameBySid(String sid) throws StudentNotFoundException1{
        if (sid==null || sid.isEmpty() || sid.equals("Jlc-008")){
            throw new StudentNotFoundException1(sid);
        }
        else {
            return "Srinivas";
        }
    }
}
class StudentNotFoundException1 extends Exception{
    StudentNotFoundException1(String sid){
        super(sid);
    }
}